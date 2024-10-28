package Practice;

import java.util.Scanner;

import Week5.ArrayUtils;

public class Prac {

	public static void main(String[] args) {
		
		/*int i = 1;
	//	boolean b = (boolean)i;
		int a = 6;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		//int j = k= l= 7;
		
		System.out.println(2 * (5 / 2 + 5 / 2));
		System.out.println(2 * 5 / 2 + 2 * 5 / 2);
		System.out.println(2 * (5 / 2));
		System.out.println(2 * 5 / 2);
		
		System.out.println("25 / 4 is " + 25 / 4);
		System.out.println("25 / 4.0 is " + 25 / 4.0);
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
		
		System.out.println("1" + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1 + 1);
		System.out.println("1" + (1 + 1));
		System.out.println('1' + 1 + 1);
		
		int num = 44008;
		System.out.println((num+"").length());
		
		
		/*Scanner input = new Scanner(System.in);
	    System.out.print("Enter an integer: ");
	    int value = input.nextInt();
	    input.nextLine();
	    System.out.println("The value is " + value);

	    System.out.print("Enter a line: ");
	    String line = input.nextLine();
	    
	    System.out.println("The line is " + line);*/
	    
	    
	/*    System.out.printf("%5d %d\n %d", 1, 2, 3);
	    System.out.printf("%5d %f\n", 1, 2.03);
	    System.out.printf("%5d %f\n", 1, 2.5);
	    System.out.printf("%.2f\n%.3f\n", 1.23456, 2.34);
	    System.out.printf("%8s\n", "Java");*/
	    
	    
	    
	   // System.out.printf("amount is %f %e\n", 32.32, 32.32);*/
	  /*  System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
	    System.out.printf("%6b\n", (1 > 2));
	    System.out.printf("%6s\n", "Java");
	    System.out.printf("%-6b%s\n", (1 > 2), "Java");
	    System.out.printf("%6b%10s\n", (1 > 2), "Java");
	    System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
	    System.out.printf("%05d %06.1f\n", 32, 32.32);*/
		
		for (int i = 1; i < 4; i++) {
			  for (int j = 1; j < 4; j++) {
			    if (i * j > 2) 
			      continue;

			    System.out.println(i * j);
			  }

			  System.out.println(i);
			}  
		int[] list1 = {2, 4, 7, 10};
		java.util.Arrays.fill(list1, 7);
		System.out.println(java.util.Arrays.toString(list1));
		int[][] n = {{1, 2}, {2, 3}, };
		ArrayUtils.printArray(n);
	
	}
	 

}
