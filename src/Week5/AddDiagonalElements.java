package Week5;

import java.util.Scanner;

public class AddDiagonalElements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[][] array = new double[4][4];
		
		System.out.println("Enter 4 by 4 matrix row by row:");
		
		//take input values into the array from the user
		for(int row=0; row<array.length; row++) {
			for(int column = 0; column< array[row].length; column++) {
				array[row][column]= input.nextDouble();
			}
		}
		
		//call the add diagonal elements method
		double sum = AddDiagonalElements(array);
		
		//print the sum of teh diagonal elements
		System.out.printf("The sum of the elements of in the major diagonal is: "+ sum );

	}
	//method to calculate the sum of the major diagonal elements
	public static double AddDiagonalElements(double[][] array) {
		double sum =0;
		
		//iterate over the rows and columns of the array
		for(int row=0; row<array.length; row++) {
			for(int column = 0; column< array[row].length; column++) {
				//only add if the  index of the row is equal to the index of the column
				if(row == column) {
					sum += array[row][column];
				}
			}
		}
		return sum;
	}

}
