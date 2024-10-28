package Week6;

public class CalculateBMI {
	 final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
	 final double METERS_PER_INCH = 0.0254; // Constant
	 private String name;
	 private int age;
	 private double weight;
	 private double height;
	 double weightInKilograms;
	 double heightInMeters;
	 
	 public CalculateBMI(String name, double weight, double height) {
		    this(name, 20, weight, height);
		  }
	 //constructor the sets the name, age, weight and height
	 public CalculateBMI(String name, int age, double weight, double height) {
		 	setName(name);
		 	setAge(age);
		 	setWeight(weight);
		 	setHeight(height);
	}
		  
	
	 //validate and set the weight
	 void setWeight(double newWeight) {
		 if(newWeight > 0) {
			  weight = newWeight;
		  } 
	 }
	 
	 
	 //validate and set the height
	 void setHeight(double newHeight) {
		 if(newHeight > 0 && height<1000) {
			  this.height = newHeight;
		  } 
	 }	 
	 //validate and set Age
	 void setAge(int age) {
		 if(age > 0 && age <= 70) {
			 this.age = age;
		 }
	 }
	 
	 //Validate and set name
	 void setName(String name) {
		 if(name != null) {
			  this.name = name;
		  } 
	 }	
	 
	 //get age
	 int getAge() {
		 return age;
	 }
	 //get name
	 String getName() {
		 return name;
	 }
	 //get weight
	 double getWeight() {
		 return weight;
	 }
	 //get height
	 double getHeight() {
		 return height;
	 }
	 
	 //calculate BMI 
	 double calculateBMI() {
		 double bmi = weight * KILOGRAMS_PER_POUND / 
			      ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
			    return Math.round(bmi * 100) / 100.0;
	 }
	 //print BMI
	 void printBMI(double bmi) {
		 System.out.println("BMI is " + bmi); 
		 if (bmi < 18.5)
			 System.out.println("Underweight");
		 else if (bmi < 25)
			 System.out.println("Normal");
		 else if (bmi < 30)
			 System.out.println("Overweight");
		 else
			 System.out.println("Obese");
	 }
	 
	//Get status   
	  public String getStatus() {
	    double bmi = calculateBMI();
	    if (bmi < 18.5)
	      return "Underweight";
	    else if (bmi < 25)
	      return "Normal";
	    else if (bmi < 30)
	      return "Overweight";
	    else
	      return "Obese";
	  }


}
