package Week5;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] matrix = new int[10][10];
		
		//initializing a multi dimnsional array
		matrix[0][0] = 3;
		matrix[0][1] = 5;
		
		//print array
		ArrayUtils.printArray(matrix);
		
		//iterate to assign values to the array
		for(int row =0; row <matrix.length; row++) {
			for(int column= 0; column <matrix[row].length; column++) {
				matrix[row][column] = (int)(Math.random() * 1000);
			}
		}
		
		
		//print the array with the new values
		ArrayUtils.printArray(matrix);
		
		//initializing method 2
		int[][] array = {
				{1, 2, 3},
				{4,5,6},
				{7,8,9}
		};
		
		//printing Array
		ArrayUtils.printArray(array);
	}
}



/*//check this
		int[][] array1 = new int[5][6];
		int[] x = {1, 2};
		array1[0] = x;
		System.out.println("array[0][1] is " + array1[0][1]);
		
		
		//int[][] r = new int[2];
		//int[] x = new int[];
		int[][] y = new int[3][];
		int[][] z = {{1, 2}};
		int[][] m = {{1, 2}, {2, 3}};
		//int[][] n = {{1, 2}, {2, 3}, } */
