package Week6;

public class TestBMI {

	 public static void main(String[] args) {
		 	//define bmi1 object for Calculate BMI class
		    CalculateBMI bmi1 = new CalculateBMI("John Doe", 18, 145, 70);
		    System.out.println("The BMI for " + bmi1.getName() + " is "
		      + bmi1.calculateBMI() + " " + bmi1.getStatus());
		    
		  //define bmi2 object for Calculate BMI class
		    CalculateBMI bmi2 = new CalculateBMI("Peter King", 215, 70);
		    System.out.println("The BMI for " + bmi2.getName() + " is "
		      + bmi2.calculateBMI() + " " + bmi2.getStatus());
		    
		  //define bmi3 object for Calculate BMI class
		    CalculateBMI bmi3 = new CalculateBMI("a", 500, 14556, 70000);
		    System.out.println("The BMI for " + bmi3.getName() + " is "
		      + bmi3.calculateBMI() + " " + bmi3.getStatus());
		    
		    bmi3.setName(null);
		    System.out.println("The BMI for " + bmi3.getName() + " is "
				      + bmi3.calculateBMI() + " " + bmi3.getStatus());
	}
}
