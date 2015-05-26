/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import javax.persistence.EntityManager;
import universityfund.db.DbHelper;

/**
 *
 * @author tan
 */
public class ClassTotalsTableModel extends TotalsTableModel {
    
    public ClassTotalsTableModel() {
        columnNames = new String[] {"Batch Year", "Total Amount Raised"};
        EntityManager em = DbHelper.getEntityManager();
        rows = em.createQuery(
                "SELECT DISTINCT d.graduationYear FROM Donor d"
        ).getResultList();
        em.close();
        dataArray = new Object[rows.size()][columnNames.length];
        int ii = 0;
        int jj = 0;
        for (Object category : rows) {
            dataArray[ii][jj++] = category;
            int total = (int) em.createNativeQuery(
                    "SELECT SUM(AMOUNT) FROM FUNDING JOIN DONATES ON "
                            + "FUNDINGID = FUNDING.ID JOIN DONOR ON "
                            + "DONORID = DONOR.ID "
                            + "WHERE DONOR.GRADUATIONYEAR = ?1"
            ).setParameter(1, category).getSingleResult();
            dataArray[ii++][jj--] = total;
        }
    }
    
}
