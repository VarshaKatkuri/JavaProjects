package assignment3_9002807;

public class SavingAccount extends Account{
	private double transactionFee;

    public SavingAccount(int id, String firstName, String lastName, double balance, double transactionFee) {
        super(id, firstName, lastName, balance);
        setTransactionFee(transactionFee); // Use the setter to apply validation
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee)  throws IllegalArgumentException {
        if (transactionFee < 0) {
            throw new IllegalArgumentException("Transaction fee must be non-negative.");
        }
        this.transactionFee = transactionFee;
    }

    @Override
    public void withdraw(double amount)  throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (getBalance() < amount + transactionFee) {
            throw new IllegalArgumentException("Insufficient balance for withdrawal and transaction fee.");
        }
        super.withdraw(amount + transactionFee);
    }

    @Override
    public void deposit(double amount)  throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        super.deposit(amount - transactionFee);
    }

    @Override
    public String toString() {
        return super.toString() + ", Transaction Fee: " + transactionFee;
    }

}
