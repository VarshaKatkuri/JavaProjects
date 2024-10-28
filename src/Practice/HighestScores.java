/**
 * 
 */
package Practice;

import java.util.Scanner;

/**(Finding the two highest scores) Write a program that prompts the user to
enter the number of students and each student’s name and score, and finally
displays the student with the highest score and the student with the second highest score.
 * 
 */
public class HighestScores {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input1.nextInt();
		
		String name = "";
		int score = 0;
		
		int firstHighestScore =0;
		int secondHighestScore = 0;
		String firstHighestName = "";
		String secondHighestName = "";
		
		
		Scanner nameInput = new Scanner(System.in);
		Scanner scoreInput = new Scanner(System.in);
		
		
		for(int i =1; i<= numberOfStudents; i++) {
			
			System.out.println("Enter the names of the student: ");
			name = nameInput.nextLine();
			
			System.out.println("Enter the score of the student: ");
			score = scoreInput.nextInt();
			
			if(score>firstHighestScore) {
				secondHighestScore = firstHighestScore;
				secondHighestName = firstHighestName;
				firstHighestScore= score;
				firstHighestName = name;
				
			}
			if(score > secondHighestScore && score < firstHighestScore) {
				secondHighestScore = score;
				secondHighestName = name;
			}
			
			
		}
		System.out.printf("The student who scored the highest is " + firstHighestName + " and their score is " + firstHighestScore);
		System.out.println("\n");
		System.out.printf("The student who scored the second highest is " + secondHighestName + " and their score is " + secondHighestScore);
		
	}

}
