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
    private String CustomerName;
    private int AccountNo;
    private double openingBalance;
    private double currentBalance;
    private double rate;
   
    public BankAccount() {
        
    }

    public BankAccount(String CustomerName, int AccountNo, double currentBalance) {
        setCustomerName(CustomerName);
        setAccountNo(AccountNo);
        setCurrentBalance(currentBalance);
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
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int AccountNo) {
        this.AccountNo = AccountNo;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

   
    
}
