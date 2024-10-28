package Week3;
import java.util.Scanner;

public class PhoneKeypads {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = input.next().trim();
		letter = letter.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int letterIndex = alphabet.indexOf(letter);
		int number=0;
		if(letterIndex >= 0  &&  letterIndex <= 2)
			number = 2;
		else if(letterIndex >= 3  &&  letterIndex <= 5)
			number = 3;
		else if(letterIndex >= 6  &&  letterIndex <= 8)
			number = 4;
		else if(letterIndex >= 9  &&  letterIndex <= 11)
			number = 5;
		else if(letterIndex >= 12  &&  letterIndex <= 14)
			number = 6;
		else if(letterIndex >= 15  &&  letterIndex <= 18)
			number = 7;
		else if(letterIndex >= 19  &&  letterIndex <= 20)
			number = 8;
		else if(letterIndex >= 21 &&  letterIndex <= 25)
			number = 9;
		else {
			System.out.println("Invalid");
			System.exit(0);
		}
		System.out.println(number);
	}

}
