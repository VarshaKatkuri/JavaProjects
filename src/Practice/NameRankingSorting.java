package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Week5.ArrayUtils;

public class NameRankingSorting {
	
	public static void main(String[] args) {
		//Initializing the scanner object 
	  	Scanner input = new Scanner(System.in);
	  	
	  	//Prompt for the year until the year is valid
	  	int year= validateYear(input);
	  	
	    //Prompt for the gender until the gender is valid
	  	String gender = validateGender(input);
	  	
	  	//Prompt the user to enter the name:
	  	System.out.print("Enter the name: ");
	  	String name = input.next().trim();
	  	
	    //Initialize two arrays for storing names of the boys and girls 
	  	String[] boyNames = new String[1000];
		String[] girlNames = new String[1000];
		
		//Call the function create baby names to create two matrices for boys and girls
		createBabyNames(year, boyNames, girlNames);
	  //  int rank = (gender.equalsIgnoreCase("M")? calculateRank(name, boyNames):calculateRank(name, girlNames));
	
		//print the rank
	  	printRank(name, 0, year);
	}
	
	/**This method validates if the year entered is valid and lies between 2001 and 2010**/
	public static int validateYear(Scanner input) {
		 //Validate the year entered and return false if year is not between 2001 and 2010
		int year;
		do {
	  		System.out.print("Enter the year: ");
	  		year = input.nextInt();
	  	}
	  	while(year < 2001 || year > 2010);
		return year;
	}
	
	/**This method validates of the gender entered if either a Male or a female**/
	public static String validateGender(Scanner input) {
		//Validate the gender entered and return false if gender is not M or m or f or F
		String gender = "";
		do {
	  		System.out.print("Enter the gender: ");
	  		gender = input.next().trim();
	  	}
	  	while(!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F") && !gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female"));
		return gender;
	}
	
	/**This method reads the baby names from all the files and stores them in two different matrices**/
	public static void createBabyNames(int year, String[] boyNames, String[] girlNames) {		
		
		//define the prefix of the file name
		
		//define the prefix of the file name
		final String FILENAME_PREFIX = "src\\GroupProject\\Data\\babynameranking";	
		File file = new File(FILENAME_PREFIX + year + ".txt");
		
		//Loop through each year from 2001 to 2010
		//for(int i = 0; i <= 2; i++) {
		//int row = 1;
			//scan the file and handle any exceptions
			try (Scanner fileScanner = new Scanner(file)) {
				int column =0; //initialize the column as 0
				 //loop until all the lines of a file are read
	            while (fileScanner.hasNextLine()) {
	            	// Use whitespace to split the line into parts and store them in a string array
	                String[] line = fileScanner.nextLine().split("\\s+"); 
	                		//store the boy names in the boyNames array
			                boyNames[column] = line[1]; 
			  
			                //store the girl names in the girlNames array
			                girlNames[column] = line[3]; 

	                column++;	  //move to the next column         
	            }
	        } 
			//scan the file and handle any exceptions
			catch (IOException ioException) {
	            ioException.printStackTrace();
			}
		
	}
	
	/**public static int calculateRank(String name, String[] names) {
		int left = 0;
	    int right = names.length - 1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        // Compare the name with the middle element of the array
	        int comparisonResult = names[mid].compareToIgnoreCase(name);

	        // If name is found at mid, return its rank (index + 1)
	        if (comparisonResult == 0) {
	            return mid + 1;
	        } else if (comparisonResult < 0) {
	            // If name is greater, ignore left half
	            left = mid + 1;
	        } else {
	            // If name is smaller, ignore right half
	            right = mid - 1;
	        }
		
	    return left;
	}
	/** This method prints the rank of the name for the given year **/
	public static void printRank(String name, int rank, int year) {
		if(rank > 0)
	  		System.out.print(formatName(name)+ " is ranked #"+ rank+ " in the year " + year); //print rank if found
	  	else
	  		System.out.print("The name "+ name+ " is not ranked in the year " + year); //else print name not in the year
	}
	
	
	/**This method formats the name with the title case**/
	public static String formatName(String name) {
		return (name.substring(0, 1).toUpperCase() + name.substring(1,(name.length())).toLowerCase());
	}

}


