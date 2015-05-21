/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund;

import universityfund.db.DbHelper;
import universityfund.ui.MainWindow;

/**
 *
 * @author MiriamMarie
 */
public class UniversityFund {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new UniversityFund().start();
    }
    
    public void start() {
        setUpJPA();
        showMainWindow();
    }
    
    private void setUpJPA() {
        DbHelper.setPersistenceUnitName("universityFundPU");
    }
    
    private void showMainWindow() {
        new MainWindow().setVisible(true);
    }
    
}
