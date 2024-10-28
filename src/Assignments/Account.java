package Assignments;

import java.util.Date;

abstract class Account {
	
	private int id=0;
	private String firstName;
	private String lastName;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	protected Account() {
		this.dateCreated = new Date();
	}
	
	protected Account(int id, String firstName, String lastName, double balance) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setBalance(balance);
		this.dateCreated = new Date();
		
	}
	
	/** Mutator methods for id, name, balance, and annualInterestRate **/
	public void setId(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("ID cannot be negative.");
		}
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		 if (firstName == null || firstName.isEmpty()) {
			 throw new IllegalArgumentException("First Name cannot be null or empty");
		 }
		this.firstName =  firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			 throw new IllegalArgumentException("Last Name cannot be null or empty");
		 }
		this.lastName = lastName;
	}
	
	public void setBalance(double balance) {
		if(balance < 0) {
			throw new IllegalArgumentException("The balance amount cannot be negative");
		}
		this.balance = balance;
	}
	
	public static void setAnnualInterestRate(double rate) {
		if(rate < 0) {
			throw new IllegalArgumentException("Annual interest rate cannot be negative");
		}
		annualInterestRate = rate;
	}	
	
	/** Accessor methods for id, name, balance, and annualInterestRate **/
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	//A method named getMonthlyInterestRate() that returns the monthly interest rate.
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	/** Abstract Method Withdraw**/
	public abstract void withdraw(double amount);
	
	/** Abstract Method Deposit**/
	public abstract void deposit(double amount);
	
	 @Override
    public String toString() {
        return "Account ID: " + getId() + "\n" +
               "First Name: " + getFirstName() + "\n" +
               "Last Name: " + getLastName() + "\n" +
               "Balance: $" + String.format("%.2f", getBalance()) + "\n" +
               "Annual Interest Rate: " + String.format("%.2f", getAnnualInterestRate()) + "%" + "\n" +
               "Monthly Interest Rate: " + String.format("%.2f", getMonthlyInterestRate()) + "%" + "\n" +
               "Date Created: " + getDate();
    }

}
	
class CheckingAccount extends Account {
	private static final double DEFAULT_OVERDRAFT_LIMIT = 500.0;
	
	private double overdraftLimit;
	
	public CheckingAccount() {
		super();
		this.overdraftLimit = DEFAULT_OVERDRAFT_LIMIT;
	}
	
	public CheckingAccount(int id, String firstName, String lastName, double balance) {
		super(id, firstName, lastName, balance);
		this.overdraftLimit = DEFAULT_OVERDRAFT_LIMIT;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	
	@Override
    public void withdraw(double amount) {
		if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
		}
        if (getBalance() + getOverdraftLimit() < amount) {
        	throw new IllegalArgumentException("Overdraft limit exceeded.");
        }
        setBalance(getBalance() - amount);
    }
	
	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        setBalance(getBalance() + amount);
	}

    @Override
    public String toString() {
        return super.toString() + "\nOverdraft Limit: $" + String.format("%.2f",getOverdraftLimit());
    }

	
	
}

class SavingsAccount extends Account {
	
	private static final double DEFAULT_TRANSACTION_FEE = 1.5;
	private double transactionFee;

    public SavingsAccount() {
        super();
        this.transactionFee = DEFAULT_TRANSACTION_FEE;
    }

    public SavingsAccount(int id, String firstName, String lastName, double balance) {
        super(id, firstName, lastName, balance);
        this.transactionFee = DEFAULT_TRANSACTION_FEE;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    @Override
    public void withdraw(double amount) {
    	if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }
    	if(getBalance()< (amount + getTransactionFee())) {
    		throw new IllegalArgumentException("Insufficient balance.");
    	}
        setBalance(getBalance() - (amount + getTransactionFee()));
    }

    @Override
    public void deposit(double amount) {
    	if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        setBalance(getBalance() + amount - getTransactionFee());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTransaction Fee: $" + String.format("%.2f",getTransactionFee());
    }
}

