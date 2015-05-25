/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.AbstractTableModel;
import universityfund.db.DbHelper;
import universityfund.db.models.Donor;

/**
 *
 * @author tan
 */
public class SelectDonorTableModel extends AbstractTableModel {
    private List<Donor> donorList;
    private int cachedIndex;
    private Donor cachedDonor;
    
    public SelectDonorTableModel() {
        EntityManager em = DbHelper.getEntityManager();
        donorList =em.createQuery(
                "SELECT d FROM Donor d", Donor.class
        ).getResultList();
        cachedIndex = -1;
        cachedDonor = null;
    }

    @Override
    public int getRowCount() {
        return donorList.size();
    }

    @Override
    public int getColumnCount() {
        return Donor.COLUMN_NAMES.length;
    }
    
    private Donor cacheDonor(int index) {
        if (cachedIndex != index) {
            cachedIndex = index;
            cachedDonor = donorList.get(index);
        }
        return cachedDonor;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return cacheDonor(rowIndex).getValue(columnIndex);
    }

    public long getDonorIdByRowIndex(int selectedRow) {
        return donorList.get(selectedRow).getId();
    }
    
    @Override
    public String getColumnName(int col) {
        return Donor.COLUMN_NAMES[col];
    }
}
