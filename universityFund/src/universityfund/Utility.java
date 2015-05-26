/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author tan
 */
public class Utility {
    
    private static int decideYear() {
        LocalDate now = java.time.LocalDate.now();
        int year = now.getYear();
        if (now.getMonthValue() <= 6) {
            year -= 1;
        }
        return year;
    }
    
    public static Date getBeginDate() {
        return Date.valueOf(LocalDate.of(decideYear(), 7, 1));
    }
    
    public static Date getEndDate() {
        return Date.valueOf(LocalDate.of(decideYear() + 1, 6, 30));
    }
}
