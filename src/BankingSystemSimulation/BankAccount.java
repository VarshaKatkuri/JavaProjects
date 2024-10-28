package BankingSystemSimulation;

import java.util.Date;

abstract class BankAccount {
	
	//declaring the required variables for a bank account
	private int accountId=0; //setting default account id to zero
	private String firstName;
	private String lastName;
	private double balance = 0; //setting initial balance to zero 
	private static double annualInterestRate = 0; //setting default annual interest rate to zero
	private Date dateCreated;
	
	/** Default constructor for BankAccount. Initializes the account creation date. */
	protected BankAccount() {
		this.dateCreated = new Date();
	}
	
	/** Parameterized constructor for BankAccount. Initializes account details. */
	protected BankAccount(int accountId, String firstName, String lastName, double balance) {
		setAccountId(accountId);
		setFirstName(firstName);
		setLastName(lastName);
		setBalance(balance);
		this.dateCreated = new Date();
	}
	
	// Setters
	/** Sets account ID; throws exception if negative. */
	public void setAccountId(int accountId) {
		// Check if the accountId is negative
		if (accountId<0) {
			 // Throw an exception with an error message if the accountId is negative
			throw new IllegalArgumentException("ID cannot be negative! Please enter the Account ID again!");
		}
		// Set the accountId to the provided value if it is valid
		this.accountId = accountId;
	}
	
	/** Sets First Name, throws exception if null or empty */
	public void setFirstName(String firstName) throws IllegalArgumentException{
	   if (firstName == null || firstName.trim().isEmpty()) {
		   // Throw an exception with an error message if the firstName is null or is empty
	        throw new IllegalArgumentException("First Name cannot be null or empty. Please re-enter your first name.");
	    }

	    // Allows alphabets but no special characters or symbols
	    if (!firstName.matches("[a-zA-Z ]+")) {
	    	//Throw an exception with an error message if the firstName contains invalid characters.
	        throw new IllegalArgumentException("First Name contains invalid characters. Please try again.");
	    }
	    // Set the firstName to the provided value if it is valid
	    this.firstName = firstName;
	}
	
	/** Sets Last Name, throws exception if null or empty */
	public void setLastName(String lastName) throws IllegalArgumentException {
	   if (lastName == null || lastName.trim().isEmpty()) {
		   // Throw an exception with an error message if the firstName is null or is empty
	        throw new IllegalArgumentException("Last Name cannot be null or empty. Please try again.");
	    }

	    // Allows alphabets but no special characters or symbols
	    if (!lastName.matches("[a-zA-Z ]+")) {
	    	//Throw an exception with an error message if the firstName contains invalid characters.
	        throw new IllegalArgumentException("Last Name contains invalid characters. Please try again.");
	    }
	    // Set the lastName to the provided value if it is valid
	    this.lastName = lastName;
	}
	
	/**Sets Balance, throws exception if balance is negative**/
	public void setBalance(double balance) throws IllegalArgumentException {
		if(balance < 0) {
			//Throw an exception with an error message if the balance is negative.
			throw new IllegalArgumentException("The balance amount cannot be negative, Please try again.");
		}
		// Set the balance to the provided value if it is valid
		this.balance = balance;
	}
	
	/**Sets Annual Interest Rate, throws exception if negative**/
	public static void setAnnualInterestRate(double rate) throws IllegalArgumentException {
		if(rate < 0 ) {
			//Throw an exception with an error message if the balance is negative.
			throw new IllegalArgumentException("Annual interest rate cannot be negative, Please try again.");
		}
		// Set the annual interest rate to the provided value if it is valid
		annualInterestRate = rate;
	}
	
	/**Getter Method for Account Id **/
	public int getAccountId() {
		return accountId;
	}
	/**Getter Method for First Name **/
	public String getFirstName() {
		return firstName;
	}
	/**Getter Method for Last Name **/
	public String getLastName() {
		return lastName;
	}
	/**Getter Method for Balance **/
	public double getBalance() {
		return balance;
	}
	/**Getter Method for Annual Interest Rate **/
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	/**Getter Method for Date of the account creation **/
	public Date getDate() {
		return dateCreated;
	}
	
	/** Method that returns monthly interest rate **/
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	/**This method is invoked to print the success message after an operation if successful **/
	protected void printSuccessMessage(String operation) {
	    System.out.println();
	    System.out.println("**** " + operation + " Successful ****");
	}
	
	/**
	 * Returns a string representation of the account, including
	 * account ID, first name, last name, balance, annual interest rate,
	 * monthly interest rate, and the date the account was created
	 */
	@Override
	public String toString() {
		return "=========  ACCOUNT SUMMARY ==========" + "\n"
					+"Account ID: " + getAccountId() + "\n" 
					+ "First Name: " + getFirstName() + "\n" 
					+ "Last Name: " + getLastName() + "\n" 
					+ "Balance: $" + String.format("%.2f", getBalance()) + "\n" 
					+ "Annual Interest Rate: " + String.format("%.2f", getAnnualInterestRate()) + "%" + "\n" 
					+ "Monthly Interest Rate: " + String.format("%.2f", getMonthlyInterestRate()) + "%" + "\n" 
					+ "Date Created: " + getDate();
	}
	
	/** Abstract Method for Withdraw**/
	public abstract void withdraw(double amount);
	
	/**public abstract void deposit**/
	public abstract void deposit(double amount);
	

	
}


