/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.sql.Date;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.persistence.EntityManager;
import universityfund.Utility;
import universityfund.db.DbHelper;
import universityfund.db.models.Donor;
import universityfund.db.models.Funding;

/**
 *
 * @author tan
 */
public class TotalClassDonorTableModel extends TotalsTableModel {
    
    public TotalClassDonorTableModel() {
        columnNames = new String[] {"Class", "Circle", "Total"};
        EntityManager em = DbHelper.getEntityManager();
        List<Donor> donorList = em.createQuery("SELECT d FROM Donor d").getResultList();
        
        Date begin = Utility.getBeginDate();
        Date end = Utility.getEndDate();
        Comparator<Integer> intComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        SortedMap<Integer, SortedMap<String, Float>> classTotals = new TreeMap<>(intComparator);
        for (Donor d : donorList) {
            float total;
            Object[] result = (Object[]) em.createNativeQuery(
                    "SELECT SUM(AMOUNT), "
                            + "SUM((NUMBEROFPAYMENTS - COMPLETEDPAYMENTS) "
                            + "* (AMOUNT / NUMBEROFPAYMENTS)) FROM FUNDING "
                            + "WHERE ID IN (SELECT FUNDINGID FROM ("
                            + "SELECT FUNDINGID, DONORID FROM DONATES "
                            + "UNION SELECT FUNDINGID, DONORID FROM PLEDGES"
                            + ") A JOIN DONOR ON DONORID = ID "
                            + "WHERE DONORID = ?1) AND DATEFUNDED "
                            + "BETWEEN ?2 AND ?3"
            ).setParameter(1, d.getId())
                    .setParameter(2, Utility.getBeginDate())
                    .setParameter(3, Utility.getEndDate()).getSingleResult();
            if (result == null) {
                continue;
            }
            total = (result[0] == null) ? 0 : ((Double) result[0]).floatValue();
            total -= (result[1] == null) ? 0 : ((Double) result[1]).floatValue();
            String circle = Funding.getCircle(total);
            SortedMap<String, Float> circleMap = classTotals.get(d.getGraduationYear());
            if (circleMap == null) 
                circleMap = new TreeMap<>();
            else {
                total += (circleMap.get(circle)==null) ? 0 : circleMap.get(circle);
            }
            
            circleMap.put(circle, total);
            classTotals.put(d.getGraduationYear(), circleMap);
        }
        
        int row = classTotals.size();
        for (Entry<Integer, SortedMap<String, Float>> entry : classTotals.entrySet()) {
            row += entry.getValue().size() - 1;
        }
        dataArray = new Object[row][columnNames.length];
        
        int ii = 0;
        int jj;
        for (Entry<Integer, SortedMap<String, Float>> entry : classTotals.entrySet()) {
            for (Entry<String, Float> entry2 : entry.getValue().entrySet()) {
                jj = 0;
                if (entry.getKey() == 0) {
                    dataArray[ii][jj++] = "N/A";
                } else {
                    dataArray[ii][jj++] = entry.getKey();
                }
                dataArray[ii][jj++] = entry2.getKey();
                dataArray[ii++][jj] = entry2.getValue();
            }
        }
        
    }
    
    @Override
    public int getRowCount() {
        return dataArray.length;
    }
    
}
