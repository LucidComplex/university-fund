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
public class Payment extends Model implements Serializable {
    private static final long serialVersionUID = -3191645214995387441L;
    
    public Payment() {
        this.classType = Payment.class;
    }
       
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected long id;

    @Override
    public void setPK() {
        this.pk = id;
    }
}
