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

   
    SavingsAccount(String name, int accountNo, double currentBalance, double intRate) {
       setCustomerName(name);
       setAccountNo(accountNo);
       setCurrentBalance(currentBalance);
       setRate(intRate);
           
    }



}
