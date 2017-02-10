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

    private double interestRate;
   // private BankReportService report;
    

    SavingsAccount(String name, int accountNo, double currentBalance, double intRate) {
       setCustomerName(name);
       setAccountNo(accountNo);
       setCurrentBalance(currentBalance);
       setInterestRate(intRate);
     //  report = new BankReportService();
              
    }

    // calculate monthy interest
    private double calculateMonthlyInt() {
        double monthlyInt = (getCurrentBalance() * getInterestRate()) / 12;
        return monthlyInt;
    }
    
    public void printReport(){
        BankReportService report = new BankReportService(); 
        report.printReport(getCustomerName() + ", your monthly interest is " + calculateMonthlyInt());
       
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
//    public BankReportService getReport() {
//        return report;
//    }
//
//    public void setReport(BankReportService report) {
//        this.report = report;
//    }

}
