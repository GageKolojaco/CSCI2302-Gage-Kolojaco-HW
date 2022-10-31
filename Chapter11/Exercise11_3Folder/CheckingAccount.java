package Chapter11.Exercise11_3Folder;

public class CheckingAccount {
    private double overdraftLimit;

	public CheckingAccount() {
		super();
		overdraftLimit = -20;
	}
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}
	private void setBalance(double d) {
    }
    private double getBalance() {
        return 0;
    }
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + 
		String.format("%.2f", overdraftLimit);
	}
    public void setAnnualInterestRate(double d) {
    }
    public void deposit(int i) {
    }
}
