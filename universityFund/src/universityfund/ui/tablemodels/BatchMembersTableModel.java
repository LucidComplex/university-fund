/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.swing.table.AbstractTableModel;
import universityfund.db.DbHelper;
import universityfund.db.models.Donor;

/**
 *
 * @author tan
 */
public class BatchMembersTableModel extends AbstractTableModel {
    private List<Donor> classMemberList;
    private int cachedIndex;
    private Donor cachedDonor;
    public BatchMembersTableModel(int year) {
        this();
        EntityManager em = DbHelper.getEntityManager();
        classMemberList = em.createQuery(
                "SELECT d FROM Donor d WHERE d.graduationYear = :year", Donor.class
        ).setParameter("year", year).getResultList();
        em.close();
    }
    
    public BatchMembersTableModel() {
        classMemberList = new Vector<>();
        cachedIndex = -1;
        cachedDonor = null;
    }

    @Override
    public int getRowCount() {
        return classMemberList.size();
    }

    @Override
    public int getColumnCount() {
        return Donor.COLUMN_NAMES.length;
    }
    
    @Override
    public String getColumnName(int col) {
        return Donor.COLUMN_NAMES[col];
    }
    
    private Donor cacheDonor(int index) {
        if (cachedIndex != index) {
            cachedIndex = index;
            cachedDonor = classMemberList.get(index);
        }
        return cachedDonor;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return cacheDonor(rowIndex).getValue(columnIndex);
    }
    
    public int getRowIndexByDonorId(long id){
        int index = 0;
        for (Donor d : classMemberList) {
            if (d.getId() == id) {
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public long getDonorIdByRowIndex(int row) {
        return classMemberList.get(row).getId();
    }
    
}
