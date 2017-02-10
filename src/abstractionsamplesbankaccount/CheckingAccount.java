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
public class CheckingAccount extends BankAccount {
    private double overDraftRate;

    CheckingAccount(String name, int accountNo, double currentBalance, double overDraftRate) {
       setCustomerName(name);
       setAccountNo(accountNo);
       setCurrentBalance(currentBalance);
       setRate(overDraftRate);
    }

    // calculating current balance if there is an OD
    @Override
    public double calculateCurrentBalance() {
        double temp;
        if (getCurrentBalance()< 0){
         temp = getCurrentBalance() - calculateInt();
        }
        else{
         temp = getCurrentBalance() + calculateInt(); 
        }
        return temp;
    }
    
    public double getOverDraftRate() {
        return overDraftRate;
    }

    public void setOverDraftRate(double overDraftRate) {
        this.overDraftRate = overDraftRate;
    }
    
}
