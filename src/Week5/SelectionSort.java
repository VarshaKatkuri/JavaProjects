package Week5;

public class SelectionSort {
	//initialize the main function
	public static void main(String[] args) {
		double[] list = {1, 4, 60, 23, 2, 5, 1};
		//call the selection sort method
		SelectionSort.SelectionSort(list);
		//print the sorted array
		ArrayUtils.printArray(list);
	}
	public static void SelectionSort(double[] list) {
	// loop from the first element of the array until the last element
		for(int i =0; i< list.length; i++)
		{
			//assign the current minimum value to the value at that index
			double currentMin = list[i];
			int currentMinIndex = i; // assign the index as the current minimum index
			//compare the element at the index i with all the elements after them 
			for(int j = i+1; j< list.length; j++)
			{
				//if there is any value that is smaller than assign the index and minimum value to that value
				if(currentMin > list[j]) { 
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			//swap the elements 
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
