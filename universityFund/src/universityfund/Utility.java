/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityfund;

import java.util.Collection;
import universityfund.db.models.Donates;
import universityfund.db.models.Pledges;

/**
 *
 * @author tan
 */
public class Utility {
    
    public static int getTotalDonations(Collection<Donates> funding) {
        int total = 0;
        for (Donates donation : funding) {
            total += donation.getFunding().getAmount();
        }
        return total;
    }
    
    public static int getTotalPledges(Collection<Pledges> funding) {
        int total = 0;
        for (Pledges donation : funding) {
            total += donation.getFunding().getAmount();
        }
        return total;
    }
}
