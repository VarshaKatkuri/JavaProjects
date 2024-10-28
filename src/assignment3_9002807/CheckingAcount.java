package assignment3_9002807;

public class CheckingAcount extends Account {
	 private double overdraftLimit;

	    public CheckingAcount(int id, String firstName, String lastName, double balance, double overdraftLimit) {
	        super(id, firstName, lastName, balance);
	        this.overdraftLimit = overdraftLimit;
	    }

	    public double getOverdraftLimit() {
	        return overdraftLimit;
	    }

	    public void setOverdraftLimit(double overdraftLimit) {
	        this.overdraftLimit = overdraftLimit;
	    }

	    @Override
	    public void withdraw(double amount) throws IllegalArgumentException {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Withdrawal amount must be positive.");
	        }
	        if (getBalance() - amount < -overdraftLimit) {
	            throw new IllegalArgumentException("Withdrawal denied due to overdraft limit.");
	        }
	        super.withdraw(amount);
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Overdraft Limit: " + overdraftLimit;
	    }
}
