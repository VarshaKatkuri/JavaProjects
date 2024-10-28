package Week6;

import java.util.Scanner;

public class PrintGrades {
	public static void main(String[] args) {
		//initialize the score class
	  	Score scores = new Score();
	  	
	  	//input the score from the user
	  	Scanner input = new Scanner(System.in);
	  	System.out.println("Enter the score:  ");
	  	int score = input.nextInt();
	  	
	  	//set the score
	  	scores.setScore(score);

	  	//print the grade
	  	System.out.print(scores.getGrades());

	}
	  
}
