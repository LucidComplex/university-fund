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
public class CategoryTotalsTableModel extends TotalsTableModel {
    
    public CategoryTotalsTableModel() {
        columnNames = new String[] {"Category", "Total Amount Raised"};
        EntityManager em = DbHelper.getEntityManager();
        rows = em.createQuery(
                "SELECT DISTINCT d.category FROM Donor d"
        ).getResultList();
        dataArray = new Object[rows.size()][columnNames.length];
        int ii = 0;
        int jj = 0;
        for (Object category : rows) {
            dataArray[ii][jj++] = category;
            int total;
            Object result = em.createNativeQuery(
                    "SELECT SUM(AMOUNT) FROM FUNDING "
                            + "WHERE ID IN (SELECT FUNDINGID "
                            + "FROM (SELECT FUNDINGID, DONORID FROM PLEDGES "
                            + "UNION SELECT FUNDINGID, DONORID FROM DONATES) A "
                            + "JOIN DONOR ON A.DONORID = DONOR.ID "
                            + "WHERE DONOR.CATEGORY = ?1)"
            ).setParameter(1, category).getSingleResult();
            if (result == null)
                total = 0;
            else
                total = (int) result;
            dataArray[ii++][jj--] = total;
        }
        em.close();
    }
    
}
