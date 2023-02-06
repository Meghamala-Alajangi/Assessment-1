package Assessment;

public class BankTester {
	
	public static void main(String[] args) {
		Bank Loan = new Bank(1001, 250000, 40000, "Car", 300000, 30);
		if (Loan.validate()) {
		Loan.checkLoanEligibility();
		}
	}
}
