package Week3;

import java.util.Scanner;

public class DisplayPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		//store the input in word and trim for extra spaces
		int lines = input.nextInt();
		int sum = 0;
		int count = 0;
		  for (int i = 1; i <= lines; i++) {
			// Print spaces
	            for (int j = 0; j < lines - i; j++) {
	                System.out.print("    ");
	            }
	            
	            // Print decreasing numbers
	            for (int j = i; j >= 1; j--) {
	                System.out.printf("%-4d", j);
	            }
	            
	            // Print increasing numbers
	            for (int j = 2; j <= i; j++) {
	                System.out.printf("%-4d", j);
	            }
	            
	            // Move to the next line
	            System.out.println();
			  
		}
		  
	}

}
