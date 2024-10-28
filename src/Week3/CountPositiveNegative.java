package Week3;

import java.util.Scanner;

public class CountPositiveNegative {
	public static void main(String[] args) {
		// Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Read an initial data
	    System.out.print(
	      "Enter any integer, positive, or negative (the input ends if it is 0): ");
	    int data = input.nextInt();
	    int countPositives = 0;
	    int countNegatives = 0;
	    float average = 0;
	    int count = 0;

	    // Keep reading data until the input is 0
	    int sum = 0;
	    while (data != 0) {
	    	
	      if(data > 0) {
	    	  countPositives++;
	      }
	      else {
	    	  countNegatives++;
	      }
	      sum += data;
	      count++;
	      average = (float)sum/ (float) count;

	      // Read the next data
	      data = input.nextInt();
	    }

	    System.out.println("The number of positives is: " + countPositives);
	    System.out.println("The number of negatives is: " + countNegatives);
	    System.out.println("The total is: " + sum);
	    System.out.println("The average is: " + average);
	    
	  }

}
