/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author tan
 */
@Entity
@IdClass(FundingId.class)
public class Pledges extends Model implements Serializable, myEntity{
    
    public Pledges() {
        this.classType = Pledges.class;
    }
    
    @Id
    private long donorId;
    @Id
    private long fundingId;
    
    @Column(nullable=true)
    private Long matchingDonorId;
    
    @OneToOne
    @JoinColumn(name="matchingDonorId", updatable=false, insertable=false)
    private Donor matchingDonor;
    
    @ManyToOne
    @JoinColumn(name="donorId", updatable=false, insertable=false)
    private Donor donor;
    
    @ManyToOne
    @JoinColumn(name="fundingId", updatable=false, insertable=false)
    private Funding funding;
    

    @Override
    public void setPK() {
        this.pk = new FundingId(donor.getId(), funding.getId());
    }
    
    public long getId(){
        return fundingId;
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
        this.fundingId = funding.getId();
    }

    @Override
    public void load(Object entity) {
        Pledges en = (Pledges) entity;
        this.donor = en.getDonor();
        this.donorId = en.getDonor().getId();
        this.funding = en.getFunding();
        this.fundingId = en.getFunding().getId();
        this.matchingDonor = en.getMatchingDonor();
        this.matchingDonorId = en.getMatchingDonor().getId();
    }

    /**
     * @return the matchingDonor
     */
    public Donor getMatchingDonor() {
        return matchingDonor;
    }

    /**
     * @param matchingDonor the matchingDonor to set
     */
    public void setMatchingDonor(Donor matchingDonor) {
        this.matchingDonor = matchingDonor;
        matchingDonorId = matchingDonor.getId();
    }
    
}
