package Week1;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the value of the radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		if(radius >= 0) {
		
			//Compute Area
			double area = radius * radius * 3.14159;
			
			//Display the Area of the circle
			System.out.print("The area of the circle for the given radius " + radius + " is "+ area);
		}
		
		else {
			System.out.print("Radius cannot be negative");
		}
	}

}
