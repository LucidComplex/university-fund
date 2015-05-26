/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.util.List;
import javax.persistence.EntityManager;
import universityfund.db.DbHelper;
import universityfund.db.models.Donor;

/**
 *
 * @author tan
 */
public class TotalClassDonorTableModel extends TotalsTableModel {
    
    public TotalClassDonorTableModel() {
        columnNames = new String[] {"Class", "Circle", "Total"};
        EntityManager em = DbHelper.getEntityManager();
        List<Donor> donorList = em.createQuery("SELECT d FROM Donor d").getResultList();
        for (Donor d : donorList) {
        }
    }
    
}
