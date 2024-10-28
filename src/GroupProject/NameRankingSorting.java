package GroupProject;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
		
		createBabyNames(year, boyNames, girlNames);
		
		//Call the function create baby names to create two matrices for boys and girls and sort them using Arrays class
	    int rank = (gender.equalsIgnoreCase("M")? calculateRank(name, boyNames):calculateRank(name, girlNames));
	    
		//print the rank
	  	printRank(name, rank, year);
	}
	
	/*This method validates if the year entered is valid and lies between 2001 and 2010*/
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
		
		//scan the file and handle any exceptions
		try (Scanner fileScanner = new Scanner(file)) {
			int column =0; //initialize the column as 0
			 //loop until all the lines of a file are read
            while (fileScanner.hasNextLine()) {
            	// Use whitespace to split the line into parts and store them in a string array
                String[] line = fileScanner.nextLine().split("\\s+"); 
                		//store the boy names in the boyNames array
		                boyNames[column] = line[1]+"-" + line[0]; 
		  
		                //store the girl names in the girlNames array
		                girlNames[column] = line[3] + "-" +  line[0]; 

                column++;	  //move to the next column         
            }
           sortNames(boyNames);
           sortNames(girlNames);
        } 
		//scan the file and handle any exceptions
		catch (IOException ioException) {
            ioException.printStackTrace();
		}
	}
	 /* This method sorts the names in the order of the ranks */
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

	
	/* This method prints the rank of the name for the given year */
	public static void printRank(String name, int rank, int year) {
		if(rank > 0)
	  		System.out.print(formatName(name)+ " is ranked #"+ rank+ " in the year " + year); //print rank if found
	  	else
	  		System.out.print("The name "+ name+ " is not ranked in the year " + year); //else print name not in the year
	}
	
	
	/*This method formats the name with the title case*/
	public static String formatName(String name) {
		return (name.substring(0, 1).toUpperCase() + name.substring(1,(name.length())).toLowerCase());
	}
	
	
	public static int calculateRank(String name, String[] namesArray) {
	    int low = 0, high = namesArray.length - 1;

	    // Loop to implement Binary Search
	    while (low <= high) {

	        // Calculating mid
	        int mid = low + (high - low) / 2;
	        String[] line = namesArray[mid].split("-", 2);
	        int res = name.toLowerCase().compareTo(line[0].toLowerCase());

	        // Check if name is present at mid
	        if (res == 0)
	            return Integer.valueOf(line[1]); // Assuming the rank is the second element

	        // If name greater, ignore left half
	        if (res > 0)
	            low = mid + 1;

	        // If name is smaller, ignore right half
	        else
	            high = mid - 1;
	    }

	    return -1;
	}
}