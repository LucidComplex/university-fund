/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import javax.persistence.EntityManager;
import universityfund.db.DbHelper;

/**
 *
 * @author tan
 */
public abstract class Model {
    public void save() {
        if (!DbHelper.isReady()) {
            DbHelper.setPersistenceUnitName("universityFundPU");
        }
        EntityManager em = DbHelper.getEntityManager();
        em.getTransaction().begin();
        em.persist(this);
        em.flush();
        em.close();
    }
}
