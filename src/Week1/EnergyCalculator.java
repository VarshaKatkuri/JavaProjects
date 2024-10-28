/*
	Name: Varsha Katkuri
	Student Id: 8907663
	PROGRAM: PROG8580 Computer Programming
    PROF: Srdjan Toholj 
    Assignment 1: To write a program that calculates energy needed
 */


package Week1;

import java.util.Scanner;

public class EnergyCalculator {
public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the amount of water in Kilogram
		System.out.print("Enter the amount of water in kilograms: ");
		double waterWeight = input.nextDouble();
		
		//check if the amount of water is positive 
		if (waterWeight >= 0) {
			
			//Prompt the user to enter the initial temperature
			System.out.print("Enter the initial temperature: ");
			double initialTemperature = input.nextDouble();
			
			//Prompt the user to enter the final temperature
			System.out.print("Enter the final temperature: ");
			double finalTemperature = input.nextDouble();
			
			//Calculate the energy
			double energyNeeded = waterWeight*(finalTemperature-initialTemperature) * 4184;
			
			//Displays the energyNeeded to the user
			System.out.print("The energy needed is: " + energyNeeded);
			
		}
		//	If the amount of water is negative then display the message
		else {
			System.out.print("Water amount cannot be a negative number!"); //Tell the user that water amount cannot be negative
		}
	}
}
