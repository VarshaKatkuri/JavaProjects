package BankingSystemSimulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBankAccount {

    private static final double DEFAULT_ANNUAL_INTEREST_RATE = 4.5;
    private static final double DEFAULT_OVERDRAFT_LIMIT = 500.0;
    private static final double DEFAULT_TRANSACTION_FEE = 1.5;
    private static final String CHECKING_ACCOUNT = "Checking";
    private static final String SAVINGS_ACCOUNT = "Savings";

    public static void main(String[] args) {
        // Set default values for account configurations
        BankAccount.setAnnualInterestRate(DEFAULT_ANNUAL_INTEREST_RATE);
        CheckingAccount.setoverdraftLimit(DEFAULT_OVERDRAFT_LIMIT);
        SavingsAccount.setTransactionFee(DEFAULT_TRANSACTION_FEE);
        //declaring the scanner object
        Scanner input = new Scanner(System.in);
        //Initializing the checking account and savings account 
        CheckingAccount checkingAccount = null;
        SavingsAccount savingsAccount = null;
        //looping until the user wants to perform all the activities
        while (true) {
        	System.out.println();
            System.out.println("****** MAIN MENU ******");
            System.out.println("1 - Create Account");
            System.out.println("2 - Perform Operations");
            System.out.println("3 - Exit");
            int choice = getValidInt(input, "Choose an option (1, 2, or 3): ");
            //Take choices 1, 2 or 3
            if (choice == 1) {
            	//create checking  and savings account if the user enters 1
            	System.out.println();
                System.out.println("****** Create Checking Account ******");
                //call the createAccount method 
                checkingAccount = (CheckingAccount) createAccount(input, CHECKING_ACCOUNT);
               
                System.out.println();
                System.out.println("****** Create Savings Account ******");
                savingsAccount = (SavingsAccount) createAccount(input, SAVINGS_ACCOUNT);
            } else if (choice == 2) {
            	//Perform operations after the user creates the accounts
                if (checkingAccount == null || savingsAccount == null) {
                    System.out.println("You would need to create accounts for performing operations!");
                } else {
                    chooseOperation(input, checkingAccount, savingsAccount);
                }
            } else if (choice == 3) {
            	//Exit the program if the user enters 3 
            	System.out.println("Thank you for banking with us today!");
                break; // Exit the program
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        //closing the scanner object
        input.close();
    }


    /** Creates a bank account based on user input and specified account type. **/
    public static BankAccount createAccount(Scanner input, String accountType) { 
        int accountId = 0;
        String firstName = null;
        String lastName = null;
        double balance = 0;

        // Loop until valid account details are provided
        while (accountId == 0 || firstName == null || lastName == null || balance == 0) {
            try {
                if (accountId == 0) {
                    accountId = getValidInt(input, "Enter AccountId: ");
                }
                if (firstName == null) {
                    firstName = getValidString(input, "Enter First Name: ");
                }
                if (lastName == null) {
                    lastName = getValidString(input, "Enter Last Name: ");
                }
                if (balance == 0) {
                    balance = getValidDouble(input, "Enter Balance: ");
                }
                BankAccount newAccount = accountType.equals(CHECKING_ACCOUNT) ? 
                        new CheckingAccount(accountId, firstName, lastName, balance) : 
                        new SavingsAccount(accountId, firstName, lastName, balance);

                System.out.println("Account created successfully:");
                System.out.println(newAccount.toString()); // Print account details immediately after creation
                return newAccount;

            } catch (IllegalArgumentException | InputMismatchException e) { //handle input mismatch or illegal argument exceptions
                System.out.println(e.getMessage());
                // Reset fields based on the exception message
                if (e.getMessage().contains("ID")) {
                    accountId = 0;
                } else if (e.getMessage().contains("First Name")) {
                    firstName = null;
                } else if (e.getMessage().contains("Last Name")) {
                    lastName = null;
                } else if (e.getMessage().contains("balance")) {
                    balance = 0;
                }
            }
            catch (Exception e) { //handle any other exceptions
                System.out.println("An unexpected error occurred: " + e.getMessage());
            } 
            
        }
        return null;
    }

    /**  Allows the user to choose operations on their accounts.**/
  
    public static void chooseOperation(Scanner input, CheckingAccount checkingAccount, SavingsAccount savingsAccount) {
        while (true) {
        	System.out.println();
        	System.out.println("*************************************************************");
            System.out.println("Choose an account type to perform operations (Enter 1, 2 or 3):");
            System.out.println("1 - Checking | 2 - Savings | 3 - Main Menu");
            int accountType = getValidInt(input, "");
            if (accountType == 1) {
                performOperations(input, checkingAccount);
            } else if (accountType == 2) {
                performOperations(input, savingsAccount);
            } else if (accountType == 3) {
                break; // Exit the operation selection
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    /** Performs operations (withdraw, deposit, print details) on the selected account. **/
    public static void performOperations(Scanner input, BankAccount account) {
    	System.out.println();
        System.out.println("***********************************************************");
        System.out.println("Choose an operation you want to perform (Enter 1, 2 or 3)");
        System.out.println("1 - Withdraw | 2 - Deposit | 3 - Print Account Details");
        int operation = getValidInt(input, "");
        
        try {
            if (operation == 1) {
                double amount = getValidDouble(input, "Enter amount to withdraw: ");
                account.withdraw(amount);
                System.out.println(account.toString());
            } else if (operation == 2) {
                double amount = getValidDouble(input, "Enter amount to deposit: ");
                account.deposit(amount);
                System.out.println(account.toString());
            } else if (operation == 3) {
            	 System.out.println(account.toString());
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        } 
    }

    /** Prompts the user for a valid integer input and Continues to prompt until a valid integer is entered. **/
    private static int getValidInt(Scanner input, String prompt) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                return input.nextInt(); // Return the valid integer
            } else {
                input.next(); // Consume the invalid input
                throw new InputMismatchException("Invalid input. Please enter a valid integer.");
            }
    }
    /** Prompts the user for a valid double input and continues until a valid double is entered. **/
    private static double getValidDouble(Scanner input, String prompt) throws InputMismatchException{
            System.out.print(prompt);
            if (input.hasNextDouble()) {
               return input.nextDouble();
            } else {
                input.next(); // Consume the invalid input
                throw new InputMismatchException("Invalid input. Please enter a valid number.");
            }
    }

    /** Prompts the user for a valid string input and returns it. **/
    private static String getValidString(Scanner input, String prompt){
    	 System.out.print(prompt);
         return input.next().trim(); // Trim leading/trailing whitespace
    }

    
}

