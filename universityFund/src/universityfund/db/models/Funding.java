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
public class Funding extends Model implements Serializable {
    
    public Funding() {
        this.classType = Funding.class;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private int amount;
    private int completedPayments;
    private String creditCardNumber;;
    private Date dateFunded;
    private int numberOfPayments;
    
    public String getCircle() {
        String[] circleGroups = {
            "President's", "Platinum", "Diamond", "Golden", "Silver",
            "Porcelain", "Crystal", "Ivory", "Lace", "Silk"
        };
        for (int ii = 50000, jj = 0; jj < 10; ii /= 2, jj++) {
            if (getAmount() / ii >= 1 && getAmount() >= 100)
                return circleGroups[jj] + " Circle";
        }
        return "";
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
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
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
    
    public static Funding createFunding(int amount) {
        Funding funding = new Funding();
        funding.setAmount(amount);
        funding.setCompletedPayments(1);
        funding.setDate(Date.valueOf(java.time.LocalDate.now()));
        funding.setNumberOfPayments(1);
        funding.save();
        return funding;
    }
    
    public static Funding createFunding(int amount, int numberOfPayments) {
        Funding funding = createFunding(amount);
        funding.setNumberOfPayments(numberOfPayments);
        funding.save();
        return funding;
    }
}
