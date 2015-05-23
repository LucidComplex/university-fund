/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author tan
 */

@Entity
public class Matcher extends Model implements Serializable {
    private static final long serialVersionUID = 7871242346605941402L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String corporationName;
    private String corporationAddress;
    private String nameOfSpouse;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the corporationName
     */
    public String getCorporationName() {
        return corporationName;
    }

    /**
     * @param corporationName the corporationName to set
     */
    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    /**
     * @return the corporationAddress
     */
    public String getCorporationAddress() {
        return corporationAddress;
    }

    /**
     * @param corporationAddress the corporationAddress to set
     */
    public void setCorporationAddress(String corporationAddress) {
        this.corporationAddress = corporationAddress;
    }

    /**
     * @return the nameOfSpouse
     */
    public String getNameOfSpouse() {
        return nameOfSpouse;
    }

    /**
     * @param nameOfSpouse the nameOfSpouse to set
     */
    public void setNameOfSpouse(String nameOfSpouse) {
        this.nameOfSpouse = nameOfSpouse;
    }

    @Override
    public void setPK() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
