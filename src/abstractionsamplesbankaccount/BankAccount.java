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
    private BankReportService report;
    

    public BankAccount() {
        
    }

    public BankAccount(String CustomerName, int AccountNo, double currentBalance) {
        setCustomerName(CustomerName);
        setAccountNo(AccountNo);
        setCurrentBalance(currentBalance);
        report = new BankReportService();
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

    public BankReportService getReport() {
        return report;
    }

    public void setReport(BankReportService report) {
        this.report = report;
    }
    
    
    
    
    
}
