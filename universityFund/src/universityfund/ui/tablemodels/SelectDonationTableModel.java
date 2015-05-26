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
import universityfund.db.models.Donates;
import universityfund.db.models.Funding;

/**
 *
 * @author MiriamMarie
 */
public class SelectDonationTableModel extends AbstractTableModel{
    String [] columnNames = {"Funding ID", "Donor Name", 
                                "Date Funded", "Amount"};
    List <Object[]> donationList;
    public SelectDonationTableModel(){
        EntityManager em = DbHelper.getEntityManager();
        donationList = em.createNativeQuery(
                "SELECT FUNDING.ID, DONOR.NAME, FUNDING.DATEFUNDED, FUNDING.AMOUNT, DONOR.ID "
                        + "FROM FUNDING JOIN DONATES "
                        + "ON FUNDINGID = FUNDING.ID "
                        + "JOIN DONOR "
                        + "ON DONORID = DONOR.ID"
        ).getResultList();

    }
    
    @Override
    public int getRowCount() {
        return donationList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    public String getColumnName(int i){
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return donationList.get(i)[i1].toString();
    }
    
    public long getFundingIdByRowIndex(int selectedRow){
        return (long) donationList.get(selectedRow)[0];
    }
    
    public long getDonorIdByRowIndex(int selectedRow){
        return (long) donationList.get(selectedRow)[4];
    }
    
}
