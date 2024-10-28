package Week5;

public class ArrayUtils {
	
	//Print array for double datatype
	public static void printArray(double[] mylist) {
		for(int i=0; i< mylist.length; i++) {
			System.out.print(mylist[i]+ " ");
		}
	}
	
	//Print Array for int datatype
	public static void printArray(int[] mylist) {
		for(int i=0; i< mylist.length; i++) {
			System.out.print(mylist[i]+ " ");
		}
	}
	
	//Calculate the sum of all the elements in the array
	public static double calculateSum(double[] mylist) {
		double sum = 0;
		for(int i = 0; i< mylist.length; i++) {
			sum += mylist[i];
		}
		return sum; 
	}
	
	//Find the Maximum Value
	public static double calculateMax(double[] mylist) {
		// Max
		double max = 0;
		//int maxIndex = 0;
		for(int i = 0; i<mylist.length; i++) {
			if(mylist[i] > max) {
				max = mylist[i];
				//maxIndex = i;
			}			
		}
		return max;
	}
	
	//Random Shuffling
	public static void randomShuffling(double[] mylist) {
		for(int i = 0; i< mylist.length; i++) {
			//generate a random index that is greater
			int index = (int)(Math.random() * (i+1));
			//swap
			double newList = mylist[i];
			mylist[i] = mylist[index];
			mylist[index] = newList;	
		}
	}
	
	//Shifting Elements
	public static void shiftingElements(double[] mylist) {
		//store the value at the first index in a temporary variable
		double firstValue = mylist[0];
		for(int i = 1; i< mylist.length; i++) {
			//shift elements to the previous index
			mylist[i-1] = mylist[i];
		}
		//assign value at the 0th index to the last index of the array
		mylist[mylist.length - 1] = firstValue;
	}
	
	//CopyArray
	public static double[] copyArray(double[] mylist) {
		double[] targetArray = new double[mylist.length];
		for(int i=0; i < mylist.length; i++) {
			targetArray[i] = mylist[i];
		}
		return targetArray;
	}
	
	//Linear Search
	//Binary Search
	public static int BinarySearch(double[] list, int key) {
		
		int low = 0;
		int high = list.length -1; 
		while(high>=low) {
			int mid = (high + low)/2;
			if (key < list[mid]) {
				high = mid -1;
			}
			else if(key > list[mid]) {
				low = mid +1;
			}
			else {
				return mid;
			}
		}
		return -low-1; 
	
	}
	
	//printArray
	public static void printArray(int[][] matrix) {
		for(int row =0; row <matrix.length; row++) {
			for(int column= 0; column <matrix[row].length; column++) {
				System.out.printf("%4d",matrix[row][column]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
