package Week6;

public class Score {
	private double score;
	
	Score(){
		score = 0;
	}

	Score(double newScore) {
		setScore(newScore);
    }
	/** Set a new score*/
	 void setScore(double newScore) {
		 if(newScore >= 0 && newScore<=100) {
			  	score = newScore;
		  }
		  else {
			  score = 1;
		  }
	  }
	 
	 //Get grades
	 public String getGrades() {
		 if (score >= 90.0)
			 return "A";
		 else if (score >= 80.0)
			 return "B";
		 else if (score >= 70.0)
				 return "C";
		 else if (score >= 60.0)
			 return "D";
		 else
			 return "F";
	  }

}
