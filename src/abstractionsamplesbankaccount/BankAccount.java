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
public class BankAccount {
    private String customerName;
    private int accountNo;
    private double openingBalance;
    private double currentBalance;
    private double rate;
   
    public BankAccount() {
    }

    public BankAccount(String customerName, int accountNo, double currentBalance, double rate) {
        setCustomerName(customerName);
        setAccountNo(accountNo);
        setCurrentBalance(currentBalance);
        setRate(rate);
    }
    
      // calculate interest
    public double calculateInt() {
        return (getCurrentBalance() * getRate());
         
    }
    // calculating current balance
    public double calculateCurrentBalance() {
         return calculateInt() + getCurrentBalance();
    }
    // print the balance
    public void printReport(){
        BankReportService report = new BankReportService(); 
        report.printReport(getCustomerName() + "," +"\n your monthly interest is " + calculateInt()
                +"\n your current balance is " + calculateCurrentBalance());
    }
 
    
     
    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int AccountNo) {
        this.accountNo = AccountNo;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

   
    
}
