/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
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
    private Set<myRow> categorySet;
    
    public CategoryTotalsTableModel() {
        EntityManager em = DbHelper.getEntityManager();
        categorySet = new TreeSet<>();
        List<String> categories = em.createQuery("SELECT d.category FROM Donor d").getResultList();
        myRow row;
        for (String category : categories) {
            row = new myRow();
            row.category = category;
            int total = em.createQuery(
                    "SELECT SUM(d.funding.amount) FROM Donates d "
                  + "WHERE d.donor.category = :category "
            ).setParameter("category", category).getFirstResult();
            System.out.println(total);
        }
        em.close();
    }

    @Override
    public int getRowCount() {
        return Donor.CATEGORY_NAMES.length;
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
        return null;
    }
    
}

class myRow {
    String category;
    int total;
}
