/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.ui.tablemodels;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import universityfund.Utility;
import universityfund.db.DbHelper;
import universityfund.db.models.Funding;

/**
 *
 * @author MiriamMarie
 */
public class CircleTotalsTableModel extends TotalsTableModel{
    public CircleTotalsTableModel(){
        columnNames = new String[] {"Donor Circle", "Total Amount Raised"};
        rows = new ArrayList<>();
        EntityManager em = DbHelper.getEntityManager();
        LocalDate now = java.time.LocalDate.now();
        int year = now.getYear();
        if (now.getMonthValue() <= 6) {
            year -= 1;
        }
        List<Funding> funding = em.createQuery(
                "SELECT f FROM Funding f WHERE f.dateFunded BETWEEN :begin AND :end"
        ).setParameter(
                "begin", Utility.getBeginDate()
        ).setParameter(
                "end", Utility.getEndDate()
        ).getResultList();
        
        Map<String, Float> circleMap = new HashMap<>();
        for (String group : Funding.CIRCLE_GROUPS) {
            circleMap.put(group, 0f);
        }
        
        for (Funding f : funding) {
            Float temp = circleMap.get(f.getCircle());
            System.out.println(temp);
            if (temp == null) {
                circleMap.put(f.getCircle(), f.getAmount());
            } else {
                circleMap.put(f.getCircle(), temp + f.getAmount());
            }
        }
        
        rows.addAll(Arrays.asList(Funding.CIRCLE_GROUPS));
        
        dataArray = new Object[rows.size()][columnNames.length];
        int ii = 0;
        int jj = 0;
        for (Object circleName : rows) {
            dataArray[ii][jj++] = circleName;
            dataArray[ii++][jj--] = circleMap.get((String) circleName);
            System.out.println(circleMap.get((String) circleName));
        }        
    }
    
}
