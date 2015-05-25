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
 * @author MiriamMarie
 */
public class CircleTotalsTableModel extends TotalsTableModel{
    public CircleTotalsTableModel(){
        columnNames = new String[] {"Donor Circle", "Total Amount Raised"};
        EntityManager em = DbHelper.getEntityManager();
        rows = em.createNativeQuery(
                "SELECT * " +
                "FROM FUNDING JOIN DONATES ON FUNDINGID = FUNDING.ID JOIN DONOR ON DONORID = DONOR.ID " +
                "WHERE ((YEAR(FUNDING.DATEFUNDED) = ?1 " +
                "AND MONTH(FUNDING.DATEFUNDED) = ?2))"
        ).getResultList();
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
