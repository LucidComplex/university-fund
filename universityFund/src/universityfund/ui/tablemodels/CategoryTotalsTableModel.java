/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.AbstractTableModel;
import universityfund.db.DbHelper;
import universityfund.db.models.Donor;

/**
 *
 * @author tan
 */
public class CategoryTotalsTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Category", "Total Amount Raised"};
    private Object[][] rowArray;
    private List<String> categories;
    
    public CategoryTotalsTableModel() {
        EntityManager em = DbHelper.getEntityManager();
        categories = em.createQuery(
                "SELECT DISTINCT d.category FROM Donor d"
        ).getResultList();
        rowArray = new Object[categories.size()][columnNames.length];
        int ii = 0;
        int jj = 0;
        for (String category : categories) {
            System.out.println("category = " + category);
            rowArray[ii][jj++] = category;
            int total = (int) em.createNativeQuery(
                    "SELECT SUM(AMOUNT) FROM FUNDING JOIN DONATES ON "
                            + "FUNDINGID = FUNDING.ID JOIN DONOR ON "
                            + "DONORID = DONOR.ID "
                            + "WHERE DONOR.CATEGORY = ?1"
            ).setParameter(1, category).getSingleResult();
            rowArray[ii++][jj--] = total;
            System.out.println("i = " + ii + "\nj = " + jj);
        }
        em.close();
    }

    @Override
    public int getRowCount() {
        return categories.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rowArray[rowIndex][columnIndex];
    }
    
}
