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
public class SavingsAccount extends IndividualAccount {

    private double incentiveBonus;
    private double promotionalInterestRate;
   
    SavingsAccount(String name, int accountNo, double currentBalance, double intRate) {
       super(name, accountNo, currentBalance, intRate);
     
    }
        
// calculate monthy interest
    @Override
    public double calculateInt() {
        return (getCurrentBalance() * getRate())/12;
     
    }
    public void doDirectDeposit(){
    
    }

    public double getIncentiveBonus() {
        return incentiveBonus;
    }

    public void setIncentiveBonus(double incentiveBonus) {
        this.incentiveBonus = incentiveBonus;
    }

    public double getPromotionalInterestRate() {
        return promotionalInterestRate;
    }

    public void setPromotionalInterestRate(double promotionalInterestRate) {
        this.promotionalInterestRate = promotionalInterestRate;
    }


}
