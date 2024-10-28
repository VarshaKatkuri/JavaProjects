package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

	public class Ranking2 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Prompt for the year until the year is valid
	        int year = validateYear(input);

	        // Prompt for the gender until the gender is valid
	        String gender = validateGender(input);

	        // Prompt the user to enter the name:
	        System.out.print("Enter the name: ");
	        String name = input.next().trim();

	        // Initialize two arrays for storing names of the boys and girls
	        String[] boyNames = new String[1000];
	        String[] girlNames = new String[1000];

	        // Call the function create baby names to create two matrices for boys and girls
	        createBabyNames(year, boyNames, girlNames);

	        // Sort the names arrays
	        sortNames(boyNames);
	        sortNames(girlNames);
	        

	        // Calculate the rank of the name entered
	        int rank = (gender.equalsIgnoreCase("M")) ? calculateRank(name, boyNames) : calculateRank(name, girlNames);

	        // Print the rank
	        printRank(name, rank, year);

	    }

	    /** This method validates if the year entered is valid and lies between 2001 and 2010 **/
	    public static int validateYear(Scanner input) {
	        int year;
	        do {
	            System.out.print("Enter the year: ");
	            year = input.nextInt();
	        } while (year < 2001 || year > 2010);
	        return year;
	    }

	    /** This method validates of the gender entered if either a Male or a female **/
	    public static String validateGender(Scanner input) {
	        String gender = "";
	        do {
	            System.out.print("Enter the gender (M/F): ");
	            gender = input.next().trim().toUpperCase();
	        } while (!gender.equals("M") && !gender.equals("F"));
	        return gender;
	    }

	    /** This method reads the baby names from all the files and stores them in two different matrices **/
	    public static void createBabyNames(int year, String[] boyNames, String[] girlNames) {
	        final String FILENAME_PREFIX = "src\\GroupProject\\Data\\babynameranking";
	        String fileName = FILENAME_PREFIX + year + ".txt";
	        
	        try (Scanner fileScanner = new Scanner(new File(fileName))) {
	            int index = 0;
	            while (fileScanner.hasNextLine() && index < 1000) {
	                String line = fileScanner.nextLine();
	                String[] parts = line.split("\\s+");
	                
	                // Store the boy's name and girl's name in respective arrays
	                boyNames[index] = parts[1];
	                //boyRank[index]= parts[0];
	                girlNames[index] = parts[3];
	                index++;
	            }
	            
	            sortNames(boyNames);
	            sortNames(girlNames);
	            
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }

	    /** This method sorts the names in the order of the ranks **/
	    public static void sortNames(String[] names) {
	        for (int i = 0; i < names.length - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < names.length -1; j++) {
	                if (names[j].compareTo(names[minIndex]) < 0) {
	                    minIndex = j;
	                }
	            }
	            // Swap names[i] with names[minIndex]
	            String temp = names[minIndex];
	            names[minIndex] = names[i];
	            names[i] = temp;
	        }
	    }

	    /** This method returns the rank of the name **/
	    public static int calculateRank(String name, String[] names) {
	        for (int i = 0; i < names.length; i++) {
	            if (names[i].equalsIgnoreCase(name)) {
	                return i + 1; // Rank is index + 1
	            }
	        }
	        return -1; // Name not found
	    }

	    /** This method prints the rank of the name for the given year **/
	    public static void printRank(String name, int rank, int year) {
	        if (rank != -1) {
	            System.out.println(formatName(name) + " is ranked #" + rank + " in the year " + year);
	        } else {
	            System.out.println("The name " + name + " is not ranked in the year " + year);
	        }
	    }

	    /** This method formats the name with the title case **/
	    public static String formatName(String name) {
	        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	    }
	}


