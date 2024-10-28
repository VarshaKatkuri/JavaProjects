package Week4;

import java.util.Scanner;

public class SumofIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the number
		System.out.print("Enter the number: ");
		long number = input.nextLong();
		
		//find the sum of digits and display to the user
		System.out.println("The sum of digits is " + sumDigits(number));

	}
	public static long sumDigits(long n) {
		long number = 0; //declare a temporary number
		while(n > 0)
		{
			
			long digit = n%((long)10); //get the remainder
			number = number + digit; //add the remainder to the number
			n = n/10; //divide the number by 10 and repeat the loop until the number >0
		}
		return number;
	}


}
