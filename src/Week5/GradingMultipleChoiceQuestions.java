package Week5;

public class GradingMultipleChoiceQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		char[] key= {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		for(int row = 0; row < answers.length; row++) {
			int score = 0;
			for(int column = 0; column < answers[row].length; column++) {
				if(answers[row][column] == key[column]) {
					score++;
				}
			}
			System.out.println("The score of Student "+ (row+1) + " is "+ score);
		}
		
	}

}
