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
public class CheckingAccount extends IndividualAccount {

    private double checkBookFee;

    CheckingAccount(String name, int accountNo, double currentBalance, double overDraftRate) {
        super(name, accountNo, currentBalance, overDraftRate);
    }

    // calculating current balance if there is an OD
    @Override
    public double calculateCurrentBalance() {
        double temp;
        if (getCurrentBalance() < 0) {
            temp = getCurrentBalance() - calculateInt();
        } else {
            temp = getCurrentBalance();
        }
        return temp;
    }

    public double getCheckBookFee() {
        return checkBookFee;
    }

    public void setCheckBookFee(double checkBookFee) {
        this.checkBookFee = checkBookFee;
    }
}
