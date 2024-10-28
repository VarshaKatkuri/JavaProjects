package Week3;

import java.util.Scanner;

class ReverseString {

	public static void main(String[] args) {
		//Take the input from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		//store the input in word and trim for extra spaces
		String word = input.next().trim();
		String reverseWord = "";
		int lengthOfWord = word.length();
		//use for loop to iterate
		for (int i = lengthOfWord; i > 0; i--) {
			reverseWord += word.charAt(i-1); //get the character at the index -1
		}
		//print the reverse word
		System.out.println(reverseWord);

	}

}
