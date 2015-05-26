/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author tan
 */
@Entity
@IdClass(FundingId.class)
public class Donates extends Model implements Serializable, myEntity {
    
    public Donates() {
        this.classType = Donates.class; 
    }
    @Id
    private long donorId;
    @Id
    private long fundingId;
    
    @ManyToOne
    @JoinColumn(name="donorId", updatable=false, insertable=false)
    private Donor donor;
    
    @ManyToOne
    @JoinColumn(name="fundingId", updatable=false, insertable=false)
    private Funding funding;
    
    public long getId(){
        return fundingId;
    }

    @Override
    public void setPK() {
        this.pk = new FundingId(donorId, fundingId);
    }

    /**
     * @return the donorId
     */
    public Donor getDonor() {
        return donor;
    }

    /**
     * @param donor the donorId to set
     */
    public void setDonor(Donor donor) {
        this.donor = donor;
        this.donorId = donor.getId();
    }

    /**
     * @return the fundingId
     */
    public Funding getFunding() {
        return funding;
    }

    /**
     * @param funding the fundingId to set
     */
    public void setFunding(Funding funding) {
        this.funding = funding;
        fundingId = funding.getId();
    }

    @Override
    public void load(Object entity) {
        Donates en = (Donates) entity;
        this.donorId = en.getDonor().getId();
        this.fundingId = en.getFunding().getId();
        this.donor = en.getDonor();
        this.funding = en.getFunding();
    }
    
}
