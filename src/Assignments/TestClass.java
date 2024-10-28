package Assignments;

import java.util.Scanner;

public class TestClass{
	 private static final double DEFAULT_ANNUAL_INTEREST_RATE = 5.5;

    public static void main(String[] args) {
    	
    	Account.setAnnualInterestRate(DEFAULT_ANNUAL_INTEREST_RATE);
        
    	Scanner input = new Scanner(System.in);
        System.out.println("****** Create Checking Account ******");
        CheckingAccount checkingAccount = createCheckingAccount(input);

        System.out.println("****** Create Savings Account ******");
        SavingsAccount savingsAccount = createSavingsAccount(input);

        while (true) {
            System.out.println("Select account type: (1) Checking (2) Savings (3) Exit");
            int accountType = getValidInt(input, "");
            if (accountType == 1) {
                performOperations(input, checkingAccount);
            } else if (accountType == 2) {
                performOperations(input, savingsAccount);
            } else if (accountType == 3) {
                break;
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }

        input.close();
    }

    public static void performOperations(Scanner input, Account account) {
        System.out.println("Select operation: (1) Withdraw (2) Deposit (3) Print Account Details");
        int operation = getValidInt(input, "");
        try {
            if (operation == 1) {
                double amount = getValidDouble(input, "Enter amount to withdraw: ");
                account.withdraw(amount);
            } else if (operation == 2) {
                double amount = getValidDouble(input, "Enter amount to deposit: ");
                account.deposit(amount);
            } else if (operation == 3) {
                System.out.println(account);
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static CheckingAccount createCheckingAccount(Scanner input) {
        Integer id = null;
        String firstName = null;
        String lastName = null;
        Double balance = null;

        while (id == null || firstName == null || lastName == null || balance == null) {
            try {
                if (id == null) {
                    id = getValidInt(input, "Enter Id: ");
                }
                if (firstName == null) {
                    firstName = getValidString(input, "Enter First Name: ");
                }
                if (lastName == null) {
                    lastName = getValidString(input, "Enter Last Name: ");
                }
                if (balance == null) {
                    balance = getValidDouble(input, "Enter Balance: ");
                }
                return new CheckingAccount(id, firstName, lastName, balance);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                if (e.getMessage().contains("ID")) {
                    id = null;
                } else if (e.getMessage().contains("First name")) {
                    firstName = null;
                } else if (e.getMessage().contains("Last name")) {
                    lastName = null;
                } else if (e.getMessage().contains("Balance")) {
                    balance = null;
                }
            }
        }
        return null;
    }

    public static SavingsAccount createSavingsAccount(Scanner input) {
        Integer id = null;
        String firstName = null;
        String lastName = null;
        Double balance = null;

        while (id == null || firstName == null || lastName == null || balance == null) {
            try {
                if (id == null) {
                    id = getValidInt(input, "Enter Id: ");
                }
                if (firstName == null) {
                    firstName = getValidString(input, "Enter First Name: ");
                }
                if (lastName == null) {
                    lastName = getValidString(input, "Enter Last Name: ");
                }
                if (balance == null) {
                    balance = getValidDouble(input, "Enter Balance: ");
                }
                return new SavingsAccount(id, firstName, lastName, balance);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                if (e.getMessage().contains("ID")) {
                    id = null;
                } else if (e.getMessage().contains("First name")) {
                    firstName = null;
                } else if (e.getMessage().contains("Last name")) {
                    lastName = null;
                } else if (e.getMessage().contains("Balance")) {
                    balance = null;
                }
            }
        }
        return null;
    }

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
