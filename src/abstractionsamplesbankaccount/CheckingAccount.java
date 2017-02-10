/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionsamplesbankaccount;

/**
 *
 * @author CPere
 */
public class CheckingAccount {
    private double overDraftRate;

    public CheckingAccount(double overDraftRate) {
        this.overDraftRate = overDraftRate;
    }

    public double getOverDraftRate() {
        return overDraftRate;
    }

    public void setOverDraftRate(double overDraftRate) {
        this.overDraftRate = overDraftRate;
    }
    
}
