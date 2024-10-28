package Week5;

import java.util.Scanner;

public class InitilaizingArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] mylist = new double[4];
		
		System.out.print("Enter "+ mylist.length + " values: ");
		
		//take input values into the array from the user
		for(int i=0; i<mylist.length; i++) {
			mylist[i]= input.nextDouble();
		}
		
		//print Array
		ArrayUtils.printArray(mylist);
		System.out.println();
		
		//Find Sum
		System.out.print("The sum of the elements in the array is: "+ ArrayUtils.calculateSum(mylist));
		System.out.println();
		
		//Calculate the largest value in the array		
		System.out.print("The largest number is: " + ArrayUtils.calculateMax(mylist));
		System.out.println();
		
		//Random Shuffling:
		ArrayUtils.randomShuffling(mylist);
		System.out.println("Random Shuffle:");
		ArrayUtils.printArray(mylist);
		System.out.println();
		
		//Shifting:
		System.out.println("Shifting Elements:");
		ArrayUtils.shiftingElements(mylist);
		ArrayUtils.printArray(mylist);
		
		/*//CopyArrays
		double[] targetArray = ArrayUtils.copyArray(mylist);
		System.out.print(targetArray);
		System.out.println();
		
		targetArray[0] = 10;
		
		//Linear Search*/
		
		//Selection Sort 
		double[] list = {1, 4, 60, 23, 2, 5, 1};
		SelectionSort.SelectionSort(list);
		System.out.print(list);
		
		
	}
	
}
