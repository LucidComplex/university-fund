/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tan
 */
public class DbHelper {
    private static EntityManagerFactory emf;
    
    public static void setPersistenceUnitName(String puName) {
        emf = Persistence.createEntityManagerFactory(puName);
    }
    
    public static EntityManager getEntityManager(String puName) {
        if (emf == null) {
            throw new IllegalStateException("Persistence Unit not set.");
        }
        return emf.createEntityManager();
    }
    
}
