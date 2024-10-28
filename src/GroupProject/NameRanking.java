package GroupProject;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NameRanking {

	/** This is the main method that calls all the methods sequentially **/
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
	  	String[][] boyNames = new String[10][1000];
		String[][] girlNames = new String[10][1000];
		
		//Call the function create baby names to create two matrices for boys and girls
		createBabyNames(boyNames, girlNames);
	  	
		//calculate the rank of the name entered using the linear search criteria
		int rank = calculateRank(year, name, gender, boyNames, girlNames);
	
		//print the rank
	  	printRank(name, rank, year);

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
	public static void createBabyNames(String[][] boyNames, String[][] girlNames) {		
		
		//define the prefix of the file name
		final String FILENAME_PREFIX = "src\\GroupProject\\Data\\babynameranking";	
		
		//Loop through each year from 2001 to 2010
		for(int i = 2001; i <= 2010; i++) {
			//build the path of the file to read the data
			File file = new File(FILENAME_PREFIX + i + ".txt");
			
			//scan the file and handle any exceptions
			try (Scanner fileScanner = new Scanner(file)) {
				int column =0; //initialize the column as 0
				 //loop until all the lines of a file are read
	            while (fileScanner.hasNextLine()) {
	            	// Use whitespace to split the line into parts and store them in a string array
	                String[] line = fileScanner.nextLine().split("\\s+"); 
	                		//store the boy names in the boyNames array
			                boyNames[i-2001][column] = line[1]; 
			                //store the girl names in the girlNames array
			                girlNames[i-2001][column] = line[3];
	                column++;	  //move to the next column         
	            }
	        } 
			//scan the file and handle any exceptions
			catch (IOException ioException) {
	            ioException.printStackTrace();
	        }
		}
	}
	
	/** This method calculates the rank of the given student based on the gender**/
	public static int calculateRank(int year, String name, String gender, String[][] boyNames, String[][] girlNames) {
		int rank = 0;
	  	if(gender.substring(0,1).equalsIgnoreCase("M")) {
	  		//if gender is male, then pass boyNames array as an argument to the getRank function
	  		rank = getRank(year, name, boyNames);
	  	}
	  	else if(gender.substring(0,1).equalsIgnoreCase("F")) {
	  		 //if gender is female, then pass girlNames array as an argument to the getRank function
	  		 rank = getRank(year, name, girlNames);
	  	}
	  	return rank; //return rank
	}
	
	/** This methods fetched the rank from the given Array **/
	public static int getRank(int year, String name, String[][] namesArray) {
		for(int i = 0; i < namesArray[year-2001].length; i++) {
			if((namesArray[year-2001][i].equalsIgnoreCase(name))) {
				 return i+1;	// ranking starts from 1
			}	
		}
		return 0; // return 0 if name not found
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
