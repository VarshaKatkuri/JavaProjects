package AssignmentPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTime {
	private final static boolean IS_ELAPSED = true;

    public static void main(String[] args) {
    	//initializing scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        //creating time object and validating the inputs entered by the user in hours, minutes and seconds
        Time time1 = getTimeFromUser(input, "Enter time1 (hour minute second): ", !IS_ELAPSED);
        //printing the time to the user
        displayTimeDetails(time1, "time1");
        
        //creating time object and validating the elapsed time entered by the user
        Time time2 = getTimeFromUser(input, "Enter time2 (elapsed time): ", IS_ELAPSED);
        //printing the time to the user
        displayTimeDetails(time2, "time2");
        
        //compare time 1 and time 2
        compareTimes(time1, time2);
        
        //clone time 1
        cloneAndCompareTime(time1);
        
        //close input object 
        input.close();
    }
    /** This method validates the type and takes the input from the user either in the hour, minute, second format or elapsed time format **/
    private static Time getTimeFromUser(Scanner input, String prompt, boolean isElapsedTime) {
        Time time = null;
        
        while (time == null) {
            try {
                // Print the prompt for user input
                System.out.print(prompt);
                
                if (isElapsedTime) {
                    // Handle elapsed time input (single long value)
                    long elapsedTime = input.nextLong();
                    time = new Time(elapsedTime);
                } else {
                    // Handle hour, minute, second input (three long values)
                    long hour = input.nextLong();
                    long minute = input.nextLong();
                    long second = input.nextLong();
                    time = new Time(hour, minute, second);
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type: Please enter valid values.");
                input.nextLine(); // Clear the buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
                input.nextLine(); // Clear the buffer
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                input.nextLine(); // Clear the buffer
            }
        }
        
        return time;
    }
    
    /** This method displays the time details to the user as output **/
    private static void displayTimeDetails(Time time, String label) {
    	//print the converted time 
        System.out.println(time);
        
        //prints the elapsed seconds
        System.out.println("Elapsed seconds in " + label + ": " + time.getSeconds());
    }
    
    /** This method returns the elapsed time between two given times**/
    private static void compareTimes(Time time1, Time time2) {
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
    }
    
    /** This method clones a time object and sends an output to the user if a clone is created successfully**/
    private static void cloneAndCompareTime(Time time) {
        try {
        	//clone the object
            Time time3 = time.clone();
            
            //print to the user
            System.out.println("time3 is created as a clone of time1");
            System.out.println("time1.compareTo(time3)? " + time.compareTo(time3));
        } catch (CloneNotSupportedException e) { //catch any exception occurred while cloning.
            System.out.println("Cloning not supported: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred during cloning: " + e.getMessage());
        }
    }
}
