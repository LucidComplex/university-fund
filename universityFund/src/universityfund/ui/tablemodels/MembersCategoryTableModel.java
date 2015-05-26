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
 * @author MiriamMarie
 */
public class MembersCategoryTableModel extends AbstractTableModel {
    private List<Donor> classMemberList;
    
    public MembersCategoryTableModel(){
        classMemberList = new Vector<>();
        EntityManager em = DbHelper.getEntityManager();
        classMemberList = em.createNativeQuery(
                "SELECT * "
                        + "FROM DONOR "
                        + "ORDER BY CATEGORY",Donor.class
        ).getResultList();
        em.close();
    }
    
    @Override
    public int getRowCount() {
        return classMemberList.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    public String getColumnName(int col){
        if(col==0)
            return "Donor Name";
        else
            return "Category";
    }

    @Override
    public Object getValueAt(int i, int i1) {
        if(i1==0){
            return classMemberList.get(i).getName();
        } 
        else
        return classMemberList.get(i).getCategory();
    }
    
}
