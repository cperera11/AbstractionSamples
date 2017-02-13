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
public class IndividualAccount extends BankAccount {

    private boolean atmFacility;

    IndividualAccount(String name, int accountNo, double currentBalance, double intRate) {
        super(name, accountNo, currentBalance, intRate);

    }

    private void doLinkAccounts() {
        System.out.println("Linking accounts for" + getCustomerName());
    }

    public boolean isAtmFacility() {
        return atmFacility;
    }

    public void setAtmFacility(boolean atmFacility) {
        this.atmFacility = atmFacility;
    }

}
