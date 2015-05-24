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
 * @param <T>
 */
public abstract class Model<T extends myEntity> {
    protected Class<T> classType;
    protected Object pk;
    public abstract void setPK(); 

    public void delete(){
        if (!DbHelper.isReady()) {
            DbHelper.setPersistenceUnitName("universityFundPU");
        }
        this.setPK();
        EntityManager em = DbHelper.getEntityManager();
        em.getTransaction().begin();
        
        T entity = em.find(classType, pk);
        em.remove(entity);
        em.getTransaction().commit();
        em.close();
    }
    
    public void save() {
        if (!DbHelper.isReady()) {
            DbHelper.setPersistenceUnitName("universityFundPU");
        }
        this.setPK();
        EntityManager em = DbHelper.getEntityManager();
        em.getTransaction().begin();
        
        T entity = em.find(classType, pk);
        if (entity == null) {
            em.persist(this);
        } else {
            entity.load(this);
        }
        em.getTransaction().commit();
        em.close();
    }
}
