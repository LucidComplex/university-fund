/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

/**
 *
 * @author tan
 */
@Entity
public class Funding extends Model implements Serializable {
    private static final long serialVersionUID = 1181465477122132198L;
    
    public Funding() {
        this.classType = Funding.class;
    }
    
    private int amount;
    private Date date;
    
    @Id
    @OneToOne(cascade=CascadeType.ALL)
    private Payment payment;
    
    @OneToOne
    private Matcher matcher;
    
    @ManyToOne
    private Donor donor;

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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    @PrePersist
    void setInitialDate() {
        this.setDate(Date.valueOf(LocalDate.now()));
    }
    
    public boolean isCompleted() {
        return true;
    }

    /**
     * @return the matcher
     */
    public Matcher getMatcher() {
        return matcher;
    }

    /**
     * @param matcher the matcher to set
     */
    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    /**
     * @return the donor
     */
    public Donor getDonor() {
        return donor;
    }

    /**
     * @param donor the donor to set
     */
    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    @Override
    public void setPK() {
        this.pk = this.payment.id;
    }
    
}
