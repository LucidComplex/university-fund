/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author tan
 */

@Entity
public class LumpPayment extends Payment implements Serializable {
    private static final long serialVersionUID = 3719665699856917067L;
    
    private String creditCardNumber;
}
