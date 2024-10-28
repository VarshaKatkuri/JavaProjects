/*(Palindrome integer) Write the following two methods
// Return the reversal of an integer, i.e. reverse(456) returns 654
public static int reverse(int number)
// Return true if number is palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome*/

package Practice;

import java.util.Scanner;

public class MethodsPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the amount of water in Kilogram
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		System.out.println(isPalindrome(number)? "The given number is a Palindrome" :  "The given number is not a Palindrome"); 

	}
	// Return the reversal of an integer, i.e. reverse(456) returns 654
	public static int reverse(int number) {
		int reversedNumber = 0;
		while(number > 0)
		{
			
			int digit = number%10;
			reversedNumber = reversedNumber*10 + digit;
			number = number/10;
		}
		return reversedNumber;
	}
	
	// Return true if number is palindrome
	public static boolean isPalindrome(int number) {
		int reversedNumber = reverse(number);
		if(reversedNumber == number) {
			return true;
		}
		return false;
	}
	
	
}
