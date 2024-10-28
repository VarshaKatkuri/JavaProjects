package BankingSystemSimulation;

public class SavingsAccount extends BankAccount{
	
	private static double transactionFee;
	
	/**
	* Default constructor for Savings Account.
	* Calls the superclass constructor.
	*/
	public SavingsAccount() {
		super();
	}
	/**
     * Parameterized constructor for SavingsAccount.
     * Initializes the savings account with the specified account ID, first name, last name, and balance.
    **/
	public SavingsAccount(int accountId, String firstName, String lastName, double balance) {
		super(accountId, firstName, lastName, balance);
	}
	
	/** Sets the transaction fee amount for all savings accounts.**/
	public static void setTransactionFee(double transactionFee) throws IllegalArgumentException{
		if(transactionFee < 0 ) {
			//Throw an exception with an error message if the transaction fee is negative.
			throw new IllegalArgumentException("Overdraft Limit  cannot be negative, Please try again.");
		}
		// Set the transaction  fee to the provided value if it is valid
		SavingsAccount.transactionFee = transactionFee;
	} 
	
	/** accessor method for transaction fee **/
	public double getTransactionFee() {
        return transactionFee;
    }
	
	/**
     * Withdraws a specified amount from the account.
     * Checks for valid amount and overdraft limit. 
    **/
	@Override
    public void withdraw(double amount) {
		if (amount <= 0) {
			//throws an exception with an error message if the amount to withdraw is less than zero
            throw new IllegalArgumentException("Withdraw amount must be positive. Please try again.");
		}
        if (getBalance()  < (amount+ getTransactionFee())) {
        	//throws an exception with an error message if it exceeds the overdraft limit. 
        	throw new IllegalArgumentException("Insufficient balance. Please try again");
        }
        //set the balance after withdrawing the amount including the transaction fee
        setBalance(getBalance() - (amount+ getTransactionFee()));
        
        //print that the operation was successful.	
        printSuccessMessage("Withdraw");
    }
	
	/**Deposits a specified amount into the account. **/
	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
			//throws an exception with an error message if the amount is less than zero. 
            throw new IllegalArgumentException("Deposit amount must be positive. Please try again.");
        }
		double newBalance = getBalance() + amount - getTransactionFee();
		// Calculate the new balance after adding the deposit amount and subtracting the transaction fee
		
		// Check if the new balance is negative
		if (newBalance < 0) {
		    // This prevents the account from going into a negative balance
		    throw new IllegalArgumentException("Deposit would result in a negative balance due to transaction fee.");
		}
		//set the balance after depositing the amount
        setBalance(getBalance() + amount - getTransactionFee());
     
        //print that the operation was successful.
        printSuccessMessage("Deposit");
	}
	
	@Override
	public String toString() {
	    return super.toString() + "\nTransaction Fee: $" + String.format("%.2f", getTransactionFee());
	}
}
