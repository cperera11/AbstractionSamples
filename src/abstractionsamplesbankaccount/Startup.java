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
public class Startup {

    public static void main(String[] args) {

        SavingsAccount savingsAc = new SavingsAccount("Bob Smith", 435126, 4200.0, 1.5);
        savingsAc.printReport();

        CheckingAccount checkingsAc = new CheckingAccount("Peter Pan", 87654, -2100.0, 0.5);
        checkingsAc.printReport();

        BankAccount[] accounts = {savingsAc, checkingsAc};

        for (BankAccount ac : accounts) {
            ac.printReport();
        }
    }
}
