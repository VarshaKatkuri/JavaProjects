package Week5;

public class Practice {
	public static void main(String[] args) {
	//	int[][] array = new int[5][6];
	//	int[] x = {1, 2};
	//	array[0] = x;
	//	System.out.println("array[0][1] is " + array[0][1]);
		
		//int[][] r = new int[2];
		//int[] x = new int[];
		//int[][] y = new int[3][];
		
		//int x = 30;
		//int[] numbers = new int[x];
		//x = 60;
		//System.out.println("x is " + x);
		//System.out.println("The size of numbers is " + numbers.length);
		
		
		//Which of the following statements are valid array declarations?
			//	int i = new int(30);
				//double d[] = new double[30];
			//	char[] r = new char(1..30);
			//	int i[] = (3, 4, 3, 2);
			//	float f[] = {2.3f, 4.5f, 6.6f};
				//char[] c = new char();
				
				//double[100] r;
			
			//	for (int i = 0; i < r.length(); i++);
			 //         r(i) = Math.random * 100;
			//	int[] myList;
			//	myList = new int[10];
			//	System.out.println("Initial size: " + myList.length); // Outputs 10
		      //  
				// Some time later you want to assign a new array to myList
				//myList = new int[20];
				//System.out.println("Initial size: " + myList.length); // Outputs 20
				
				
				
					int number = 0;
					int[] numbers = new int[1];
					m(number, numbers);
					System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);
					
					int[] list = {1, 2, 3, 4, 5};
					reverse(list);
					for (int i = 0; i < list.length; i++)
					System.out.print(list[i] + " ");
					
					
		        
	}
	public static void m(int x, int[] y) {
		x = 3;
		y[0] = 3;
		}
	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < list.length; i++)
		newList[i] = list[list.length - 1 - i];
		list = newList;
		}

}
