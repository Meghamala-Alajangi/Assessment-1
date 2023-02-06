package Assessment;

import java.util.Scanner;

public class Bank {

	private int accNum, accBalance, salary, LoanAmntExptd, EmiExptd;
	private String LoanType;
	
    public Bank(int accNum, int accBalance, int salary,
	String LoanType, int LoanAmntExpected, int EmiExpected) {
	this.accNum = accNum;
	this.accBalance = accBalance;
	this.salary = salary;
	this.LoanType = LoanType;
	this.LoanAmntExptd = LoanAmntExptd;
	this.EmiExptd = EmiExptd;
	}

	public boolean validate() {
	if (accNum < 1000 || accNum > 9999) {
	System.out.println("Invalid account number");
	return false;
	}
	if (accBalance < 1000) {
	System.out.println("Insufficient account balance");
	return false;
	}
	return true;
	}

	public boolean checkLoanEligibility() {
	int eligibleLoanAmnt = 0,  eligibleEmis = 0;;
	
	if (salary > 25000 && LoanType.equals("Car")) {
	eligibleLoanAmnt = 500000;
	eligibleEmis = 36;
	}
	else if (salary > 50000 && salary <= 75000 && LoanType.equals("House")) {
	eligibleLoanAmnt = 6000000;
	eligibleEmis = 60;
	}
	else if (salary > 75000 && LoanType.equals("Business")) {
	eligibleLoanAmnt = 7500000;
	eligibleEmis = 84;
	}
	else if (eligibleLoanAmnt == 0) {
	System.out.println("Not eligible for Loan");
	return false;
	}
	else if (LoanAmntExptd > eligibleLoanAmnt || EmiExptd > eligibleEmis) {
	System.out.println("Loan not provided");
	return false;
	}
	else {
		
	}
	System.out.println("Eligible Loan Amount : " + eligibleLoanAmnt);
	System.out.println("Eligible EMIs : " + eligibleEmis);
	return true;
	}
}

		

