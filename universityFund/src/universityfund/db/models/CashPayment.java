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
public class CashPayment extends Payment implements Serializable {
    private static final long serialVersionUID = -1828802661701583184L;
    
}
