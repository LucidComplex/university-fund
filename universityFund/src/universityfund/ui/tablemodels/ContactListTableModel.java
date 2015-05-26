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
 * @author MiriamMarie
 */
public class ContactListTableModel extends AbstractTableModel
{
    List <Donor> memberList;
    
    public ContactListTableModel() {
    }
    
    public ContactListTableModel(Donor donor){
        EntityManager em = DbHelper.getEntityManager();
        memberList = em.createNativeQuery(
                "SELECT * "
              + "FROM DONOR "
              + "WHERE DONOR.GRADUATIONYEAR = ?1", Donor.class
        ).setParameter(1, donor.getGraduationYear()).getResultList();
    }

    @Override
    public int getRowCount() {
        return memberList.size();
    }

    @Override
    public int getColumnCount() {
        return Donor.COLUMN_NAMES.length;
    }
    
    public String getColumnName(int col){
        return Donor.COLUMN_NAMES[col];
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return memberList.get(i).getValue(i1);
    }
    
}
