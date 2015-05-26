/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.sql.Date;
import java.util.ArrayList;
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
        SortedMap<Integer, SortedMap<String, Integer>> classTotals = new TreeMap<>(intComparator);
        for (Donor d : donorList) {
            int total;
            Object result = em.createNativeQuery(
                    "SELECT SUM(AMOUNT) "
                  + "FROM FUNDING WHERE ID IN ("
                      + "SELECT FUNDINGID "
                      + "FROM DONATES "
                      + "WHERE DONORID = ?1 "
                      + "UNION "
                      + "SELECT FUNDINGID "
                      + "FROM PLEDGES "
                      + "WHERE DONORID = ?1"
                  + ") "
                  + "AND DATEFUNDED BETWEEN ?2 AND ?3"
            ).setParameter(1, d.getId())
                    .setParameter(2, Utility.getBeginDate())
                    .setParameter(3, Utility.getEndDate()).getSingleResult();
            total = (result == null) ? 0 : (int) result;
            String circle = Funding.getCircle(total);
            SortedMap<String, Integer> circleMap = classTotals.get(d.getGraduationYear());
            if (circleMap == null) 
                circleMap = new TreeMap<>();
            else {
                total += (circleMap.get(circle)==null) ? 0 : circleMap.get(circle);
            }
            
            circleMap.put(circle, total);
            classTotals.put(d.getGraduationYear(), circleMap);
        }
        
        int row = classTotals.size();
        for (Entry<Integer, SortedMap<String, Integer>> entry : classTotals.entrySet()) {
            row += entry.getValue().size() - 1;
        }
        dataArray = new Object[row][columnNames.length];
        
        int ii = 0;
        int jj;
        for (Entry<Integer, SortedMap<String, Integer>> entry : classTotals.entrySet()) {
            for (Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                jj = 0;
                dataArray[ii][jj++] = entry.getKey();
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
