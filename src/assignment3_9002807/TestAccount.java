package assignment3_9002807;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		  // Perform operations on CheckingAccount
	        try {
	        // Set the annual interest rate
	        System.out.print("Enter the annual interest rate (e.g., 4.5 for 4.5%): ");
	        double annualInterestRate = scanner.nextDouble();
	        Account.setAnnualInterestRate(annualInterestRate);

	        // Create a CheckingAccount
	        System.out.println("\nCreating Checking Account:");
	        System.out.print("Enter Checking Account ID: ");
	        int checkingId = scanner.nextInt();
	        scanner.nextLine();  // Consume newline
	        System.out.print("Enter Checking Account First Name: ");
	        String checkingFirstName = scanner.nextLine();
	        System.out.print("Enter Checking Account Last Name: ");
	        String checkingLastName = scanner.nextLine();
	        System.out.print("Enter Checking Account Balance: ");
	        double checkingBalance = scanner.nextDouble();
	        System.out.print("Enter Checking Account Overdraft Limit: ");
	        double overdraftLimit = scanner.nextDouble();

	       

	      
	        	 CheckingAcount checking = new CheckingAcount(checkingId, checkingFirstName, checkingLastName, checkingBalance, overdraftLimit);
	            System.out.print("\nEnter amount to withdraw from Checking Account: ");
	            double withdrawAmount = scanner.nextDouble();
	            checking.withdraw(withdrawAmount);
	            System.out.print("Enter amount to deposit into Checking Account: ");
	            double depositAmount = scanner.nextDouble();
	            checking.deposit(depositAmount);
	            System.out.println("\nChecking Account Details:");
	            System.out.println(checking);
	            System.out.println("Monthly Interest: " + checking.getMonthlyInterestRate() + "%");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Create a SavingAccount
	        System.out.println("\nCreating Saving Account:");
	        System.out.print("Enter Saving Account ID: ");
	        int savingId = scanner.nextInt();
	        scanner.nextLine();  // Consume newline
	        System.out.print("Enter Saving Account First Name: ");
	        String savingFirstName = scanner.nextLine();
	        System.out.print("Enter Saving Account Last Name: ");
	        String savingLastName = scanner.nextLine();
	        System.out.print("Enter Saving Account Balance: ");
	        double savingBalance = scanner.nextDouble();
	        System.out.print("Enter Saving Account Transaction Fee: ");
	        double transactionFee = scanner.nextDouble();

	       // SavingAccount savings = new SavingAccount(savingId, savingFirstName, savingLastName, savingBalance, transactionFee);

	        // Perform operations on SavingAccount
	        try {
	        	SavingAccount savings = new SavingAccount(savingId, savingFirstName, savingLastName, savingBalance, transactionFee);
	            System.out.print("\nEnter amount to withdraw from Saving Account: ");
	            double withdrawAmount = scanner.nextDouble();
	            savings.withdraw(withdrawAmount);
	            System.out.print("Enter amount to deposit into Saving Account: ");
	            double depositAmount = scanner.nextDouble();
	            savings.deposit(depositAmount);
	            System.out.println("\nSaving Account Details:");
	            System.out.println(savings);
	            System.out.println("Monthly Interest: " + savings.getMonthlyInterestRate() + "%");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        scanner.close();
	    }

	}


