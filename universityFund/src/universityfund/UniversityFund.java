/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund;

import javax.persistence.Persistence;

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
    }
    
    private void setUpJPA() {
        Persistence.createEntityManagerFactory("universityFundPU").createEntityManager();
    }
    
}
