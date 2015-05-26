/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
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
public class Pledges extends Model implements Serializable, myEntity{
    
    public Pledges() {
        this.classType = Pledges.class;
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
    
    private String corporationAddress;
    private String corporationName;
    private String nameOfSpouse;

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
    public void load(Object entity) {
        Pledges en = (Pledges) entity;
        this.donor = en.getDonor();
        this.donorId = en.getDonor().getId();
        this.funding = en.getFunding();
        this.fundingId = en.getFunding().getId();
    }
    
}
