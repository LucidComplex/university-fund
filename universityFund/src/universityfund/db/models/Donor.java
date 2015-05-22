/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author tan
 */

@Entity
public class Donor extends Model implements Serializable {
    private static final long serialVersionUID = 5685414599899853806L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    private String address;
    private String category;
    private String contactNumber;
    private String email;
    private int graduationYear;
    private String name;
    
    @OneToMany(mappedBy="donor")
    @JoinTable(
            name="Donates", joinColumns=@JoinColumn(name="donor_id"),
            inverseJoinColumns=@JoinColumn(name="funding_id")
    )
    private Collection<Funding> donations;
    
    @OneToMany(mappedBy="donor")
    @JoinTable(
            name="Pledges", joinColumns=@JoinColumn(name="donor_id"),
            inverseJoinColumns=@JoinColumn(name="funding_id")
    )
    private Collection<Funding> pledges;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the donations
     */
    public Collection<Funding> getDonations() {
        return donations;
    }

    /**
     * @param donations the donations to set
     */
    public void setDonations(Collection<Funding> donations) {
        this.donations = donations;
    }

    /**
     * @return the pledges
     */
    public Collection<Funding> getPledges() {
        return pledges;
    }

    /**
     * @param pledges the pledges to set
     */
    public void setPledges(Collection<Funding> pledges) {
        this.pledges = pledges;
    }

    /**
     * @return the graduationYear
     */
    public int getGraduationYear() {
        return graduationYear;
    }

    /**
     * @param graduationYear the graduationYear to set
     */
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
