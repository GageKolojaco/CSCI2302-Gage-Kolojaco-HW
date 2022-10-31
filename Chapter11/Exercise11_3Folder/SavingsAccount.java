package Chapter11.Exercise11_3Folder;

public class SavingsAccount {
    public SavingsAccount() {
		super();
	}
	public SavingsAccount(int id, double balance) {
		super();
	}
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Error! Savings account overdrawn transtaction rejected");
	}
    private void setBalance(double d) {
    }
    private double getBalance() {
        return 0;
    }
    public void setAnnualInterestRate(double d) {
    }
    public void deposit(int i) {
    }
}
