package assignment3_9002807;

import java.util.Date;

public abstract class Account {
	 private int id;
	    private String firstName;
	    private String lastName;
	    private double balance;
	    private static double annualInterestRate;
	    private Date dateCreated;

	    public Account() {
	        this(0, "Default", "Customer", 0);
	    }

	    public Account(int id, String firstName, String lastName, double balance)  throws IllegalArgumentException {
	        if (id <= 0) {
	            throw new IllegalArgumentException("ID must be positive.");
	        }
	        if (firstName == null || firstName.trim().isEmpty()) {
	            throw new IllegalArgumentException("First name cannot be null or empty.");
	        }
	        if (lastName == null || lastName.trim().isEmpty()) {
	            throw new IllegalArgumentException("Last name cannot be null or empty.");
	        }
	        if (balance < 0) {
	            throw new IllegalArgumentException("Balance cannot be negative.");
	        }
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.balance = balance;
	        this.dateCreated = new Date();
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id)  throws IllegalArgumentException {
	        if (id <= 0) {
	            throw new IllegalArgumentException("ID must be positive.");
	        }
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName)  throws IllegalArgumentException {
	        if (firstName == null || firstName.trim().isEmpty()) {
	            throw new IllegalArgumentException("First name cannot be null or empty.");
	        }
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName)  throws IllegalArgumentException {
	        if (lastName == null || lastName.trim().isEmpty()) {
	            throw new IllegalArgumentException("Last name cannot be null or empty.");
	        }
	        this.lastName = lastName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) throws IllegalArgumentException {
	        if (balance < 0) {
	            throw new IllegalArgumentException("Balance cannot be negative.");
	        }
	        this.balance = balance;
	    }

	    public static double getAnnualInterestRate() {
	        return annualInterestRate;
	    }

	    public static void setAnnualInterestRate(double annualInterestRate)  throws IllegalArgumentException {
	        if (annualInterestRate < 0) {
	            throw new IllegalArgumentException("Annual interest rate cannot be negative.");
	        }
	        Account.annualInterestRate = annualInterestRate;
	    }

	    public Date getDateCreated() {
	        return dateCreated;
	    }

	    public double getMonthlyInterestRate() {
	        return annualInterestRate / 12;
	    }

	    public void withdraw(double amount)  throws IllegalArgumentException {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Withdrawal amount must be positive.");
	        }
	        if (balance - amount < 0) {
	            throw new IllegalArgumentException("Insufficient balance.");
	        }
	        balance -= amount;
	    }

	    public void deposit(double amount)  throws IllegalArgumentException {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Deposit amount must be positive.");
	        }
	        balance += amount;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Balance: " + balance + ", Date Created: " + dateCreated;
	    }

}
