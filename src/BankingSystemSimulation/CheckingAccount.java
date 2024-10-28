package BankingSystemSimulation;

public class CheckingAccount extends BankAccount{
	
	private static double overdraftLimit = 0;
	
	/**
	* Default constructor for CheckingAccount.
	* Calls the superclass constructor.
	*/
	public CheckingAccount() {
		 super();
	}
	
	/**
     * Parameterized constructor for CheckingAccount.
     * Initializes the checking account with the specified account ID, first name, last name, and balance.
    **/
	public CheckingAccount(int accountId, String firstName, String lastName, double balance) {
		super(accountId, firstName, lastName, balance);
	}
	 /** Sets the overdraft limit for all checking accounts.**/
	public static void setoverdraftLimit(double overdraftLimit) throws IllegalArgumentException{
		if(overdraftLimit < 0 ) {
			//Throw an exception with an error message if the overdraft limit is negative.
			throw new IllegalArgumentException("Overdraft Limit  cannot be negative, Please try again.");
		}
		// Set the overdraft Limit to the provided value if it is valid
		CheckingAccount.overdraftLimit = overdraftLimit;
	} 
	/** accessor method for overdraft limit **/
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	/**
     * Withdraws a specified amount from the account.
     * Checks for valid amount and overdraft limit. 
    **/
	@Override
    public void withdraw(double amount) {
		if (amount <= 0) {
			//throws an exception with an error message if the amount to withdraw is less than zero
            throw new IllegalArgumentException("Withdraw amount must be positive and greater than zero. Please try again.");
		}
        if (getBalance() + getOverdraftLimit() < amount) {
        	//throws an exception with an error message if it exceeds the overdraft limit. 
        	throw new IllegalArgumentException("Overdraft limit exceeded or Insufficient Balance. Please try again.");
        }
        //set the balance after withdrawing the amount
        setBalance(getBalance() - amount);
        
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
		//set the balance after depositing the amount
        setBalance(getBalance() + amount);
        
        //print that the operation was successful.
        printSuccessMessage("Deposit");
	}
	/**
     * Returns a string representation of the checking account, including the overdraft limit.
     * **/
	@Override
	public String toString() {
	    return super.toString() + "\nOverdraft Limit: $" + String.format("%.2f", getOverdraftLimit());
	} 
}

