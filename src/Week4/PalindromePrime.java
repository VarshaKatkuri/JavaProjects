package Week4;

public class PalindromePrime {

	public static void main(String[] args) {
		 System.out.println("The first 100 prime palindrome numbers are \n");
		 printPalindomePrimeNumbers(100);

	}
	public static void printPalindomePrimeNumbers(int numberOfPrimes) {
		 final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		 int count = 0; // Count the number of prime numbers
		 int number = 2; // A number to be tested for primeness

		 // Repeatedly find prime numbers
		 while (count < numberOfPrimes) {
			 // Print the prime number and increase the count
		     if (isPrime(number) && isPalindrome(number)) {
		       count++; // Increase the count
		       
		       if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
		          // Print the number and advance to the new line
		          System.out.printf("%-10d\n", number);
		       }
		       else
		          System.out.printf("%-10d", number);
		      }

		      // Check if the next number is prime
		      number++;
		    }
		  }
	/** Check whether number is prime */
	public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	    }

	    return true; // number is prime
	  }
	
	/** Reverse the number*/
	public static int reverse(int number) {
		int reversedNumber = 0;
		while(number > 0)
		{
				
			int digit = number%10; //get the remainder
			reversedNumber = reversedNumber*10 + digit; //add the remainder to the number
			number = number/10;  //divide the number by 10 and repeat the loop until the number >0
		}
		return reversedNumber;
	}
		
	 /** Check if the number is Palindrome**/
	public static boolean isPalindrome(int number) {
		int reversedNumber = reverse(number); // call reverse number function and get the reverse number
		if(reversedNumber == number) { 
			return true; //compare if the reverse number is equal to the actual number, if so return True
		}
		return false; //else return False
	}
		
}
