/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author tan
 */
@Entity
public class Funding extends Model implements Serializable, myEntity {
    public static final String[] CIRCLE_GROUPS = {
            "President's", "Platinum", "Diamond", "Golden", "Silver",
            "Porcelain", "Crystal", "Ivory", "Lace", "Silk", "N/A"
    };
    
    public Funding() {
        this.classType = Funding.class;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private float amount;
    private int completedPayments;
    private String creditCardNumber;;
    private Date dateFunded;
    private int numberOfPayments;
    
    public String getCircle() {
        return Funding.getCircle(getAmount());
    }
    
    public static String getCircle(float amount) {
        for (int ii = 50000, jj = 0; jj < 10; ii /= 2, jj++) {
            if (amount / ii >= 1 && amount >= 100)
                return CIRCLE_GROUPS[jj];
        }
        return "N/A";
    }
    
    public boolean isComplete() {
        return getNumberOfPayments() == getCompletedPayments();
    }

    @Override
    public void setPK() {
        this.pk = this.id;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the completedPayments
     */
    public int getCompletedPayments() {
        return completedPayments;
    }

    /**
     * @param completedPayments the completedPayments to set
     */
    public void setCompletedPayments(int completedPayments) {
        this.completedPayments = completedPayments;
    }

    /**
     * @return the creditCardNumber
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber the creditCardNumber to set
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * @return the dateFunded
     */
    public Date getDate() {
        return dateFunded;
    }

    /**
     * @param _date the dateFunded to set
     */
    public void setDate(Date _date) {
        this.dateFunded = _date;
    }

    /**
     * @return the numberOfPayments
     */
    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    /**
     * @param numberOfPayments the numberOfPayments to set
     */
    public void setNumberOfPayments(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }
    
    public static Funding createFunding(float amount) {
        Funding funding = new Funding();
        funding.setAmount(amount);
        funding.setCompletedPayments(1);
        funding.setDate(Date.valueOf(java.time.LocalDate.now()));
        funding.setNumberOfPayments(1);
        funding.save();
        return funding;
    }
    
    public static Funding createFunding(float amount, int numberOfPayments) {
        Funding funding = createFunding(amount);
        funding.setCompletedPayments(0);
        funding.setNumberOfPayments(numberOfPayments);
        funding.save();
        return funding;
    }

    @Override
    public void load(Object entity) {
        Funding funding = (Funding) entity;
        this.amount = funding.getAmount();
        this.completedPayments = funding.getCompletedPayments();
        this.creditCardNumber = funding.getCreditCardNumber();
        this.dateFunded = funding.getDate();
        this.numberOfPayments = funding.getNumberOfPayments();
        this.id = funding.getId();
    }
}
