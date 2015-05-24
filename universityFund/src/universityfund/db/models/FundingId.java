/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund.db.models;

import java.io.Serializable;

/**
 *
 * @author tan
 */

public class FundingId implements Serializable{
    long donorId;
    long fundingId;
    
    public FundingId(long donor, long funding) {
        this.donorId = donor;
        this.fundingId = funding;
    }

    @Override
    public int hashCode() {
        return (int) (donorId * fundingId);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
}
