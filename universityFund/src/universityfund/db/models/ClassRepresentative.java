/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author tan
 */

@Entity
public class ClassRepresentative extends Model implements Serializable, myEntity {
    public ClassRepresentative() {
        this.classType = ClassRepresentative.class;
    }
    
    @Override
    public void setPK() {
        this.pk = batchYear;
    }
    
    @Id
    private int batchYear;
    @OneToOne
    private Donor representative;

    /**
     * @return the year
     */
    public int getBatchYear() {
        return batchYear;
    }

    /**
     * @param year the year to set
     */
    public void setBatchYear(int year) {
        this.batchYear = year;
        this.pk = year;
    }

    /**
     * @return the representative
     */
    public Donor getRepresentative() {
        return representative;
    }

    /**
     * @param representative the representative to set
     */
    public void setRepresentative(Donor representative) {
        this.representative = representative;
    }

    @Override
    public void load(Object entity) {
        ClassRepresentative rep = (ClassRepresentative) entity;
        this.batchYear = rep.getBatchYear();
        this.representative = rep.getRepresentative();
    }

}
