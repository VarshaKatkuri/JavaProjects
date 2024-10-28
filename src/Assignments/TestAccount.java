package Assignments;

import java.util.Scanner;

public class TestAccount {

    public static void main(String[] args) {
    	
    	//Declare Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
       
        //Creating the checking account for the user
        System.out.println("****** Create Checking Account ******");
        CheckingAccount checkingAccount = createCheckingAccount(input);
        System.out.println(checkingAccount.toString());

        //Creating Savings Account for the user
        System.out.println("****** Create Savings Account ******");
        SavingsAccount savingsAccount = createSavingsAccount(input);
        System.out.println(savingsAccount.toString());

        //This code allows the user to select the account type and then asks if they have to withdraw amount, deposit or print the account details and performs necessary action as required
        while (true) {
        	//Prompt the user to select the account type
            System.out.println("Select account type: (1) Checking (2) Savings (3) Exit");
            int accountType = getValidInt(input, "");
            //If the user inputs 1, then operations are performed in the user's checking account
            if (accountType == 1) {
                performOperations(input, checkingAccount);
            } 
            //If the user inputs 2, then operations are performed in the user's savings account
            else if (accountType == 2) {
                performOperations(input, savingsAccount);
            } 
            //if the user inputs 3, then the user will exit the system.
            else if (accountType == 3) {
                break;
            }
            //if the user inputs 4, then the user will be displayed an error message and prompted to try again. 
            else {
            	System.out.println("Invalid selection. Please try again.");
            }
        }

        input.close();
    }

    /** This program performs the withdraw and deposit operations based on the selected account type **/
    public static void performOperations(Scanner input, Account account) {
        
    	//prompting the user to select one of the actions they want to perform. User enters the valid number
    	System.out.println("Select operation: (1) Withdraw (2) Deposit (3) Print Account Details");
        int operation = getValidInt(input, "");
        try {
        	// if user enters 1, then user withdraws the money
            if (operation == 1) {
                double amount = getValidDouble(input, "Enter amount to withdraw: ");
                account.withdraw(amount);
            } 
            //if user enters 2, then deposits money to their account
            else if (operation == 2) {
                double amount = getValidDouble(input, "Enter amount to deposit: ");
                account.deposit(amount);
            } 
            //if user enters 3, then their account details are printed on the screen
            else if (operation == 3) {
                System.out.println(account);
            } 
            //if user enters any other number, then an invalid operation message is printed. 
            else {
                System.out.println("Invalid operation. Please try again.");
            }
        } 
        catch (IllegalArgumentException e) {
        	// catch any other exception if occurs. 
            System.out.println(e.getMessage());
        }
    }
    
    /** This method creates Checking Account for the user**/
    public static CheckingAccount createCheckingAccount(Scanner input) {
        while (true) {
            try {
            	//All the inputs are validated and the user is re-prompted if any wrong input is provided.
                int id = getValidInt(input, "Enter Id: ");
                String firstName = getValidString(input, "Enter First Name: ");
                String lastName = getValidString(input, "Enter Last Name: ");
                double balance = getValidDouble(input, "Enter Balance: ");
          
                //A checking account is created if all the inputs entered by the user are valid.
                return new CheckingAccount(id, firstName, lastName, balance);
            } 
            catch (IllegalArgumentException e)
            {
            	System.out.println(e.getMessage());
            }
        }
    }
    
    /** This method creates Savings Account for the user**/
    public static SavingsAccount createSavingsAccount(Scanner input) {
        while (true) {
            try {
            	//All the inputs are validated and the user is re-prompted if any wrong input is provided.
                int id = getValidInt(input, "Enter Id: ");
                String firstName = getValidString(input, "Enter First Name: ");
                String lastName = getValidString(input, "Enter Last Name: ");
                double balance = getValidDouble(input, "Enter Balance: ");
            
                //A savings account is created if all the inputs entered by the user are valid.
                return new SavingsAccount(id, firstName, lastName, balance);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    /** This method validates if the input of type integer entered by the user is valid, if not, the program re-prompts the user**/
    private static int getValidInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next(); // consume the invalid input
            }
        }
    }
    
    /** This method validates if the input of type String entered by the user is valid, if not, the program re-prompts the user**/
    private static String getValidString(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = input.next().trim();
            if (!value.isEmpty()) {
                return value;
            } else {
                System.out.println("Invalid input. Please enter a non-empty string.");
            }
        }
    }
    
    /** This method validates if the input of the type double entered by the user is valid, if not, the program re-prompts the user**/    
    private static double getValidDouble(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                double value = input.nextDouble();
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // consume the invalid input
            }
        }
    }
}
