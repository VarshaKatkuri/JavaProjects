package Week2;
import java.util.Scanner;


public class Week2Practice {
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
			System.out.print("Enter three words separated by spaces: ");
			String s1 = input.nextLine();
			String s2 = input.next();
			String s3 = input.next();
			System.out.println("s1 is " + s1);
			//System.out.println("s2 is " + s2);
			//System.out.println("s3 is " + s3);
		
		//Math.pow function
		System.out.println(Math.pow(5, 2));
		
		
		// to convert double value to float value mention f next to the value eg: 1.0f/3.0f
		//float ft = 1.0/3.0; - this will throw an error
		float ft = 1.0f/3.0f;
		System.out.println(ft);
		
		
		//boolean functions- checks conditions and returns either true or false
		System.out.println(1<2);
		System.out.println(1==2);
	
		//Math.Random function 
		int num1 = (int) (Math.random());
		System.out.println(num1); //generates a random number between 0 and 1
		System.out.println(Math.random()* 10); //multiplies the number that is generated in between 0 and 1 with 10 and displays the answer
		System.out.println((int)(Math.random()* 10)); //generates a random number between 1 and 10
		System.out.println((int)(Math.random()* 100)); //generates a random number between 10 and 100 	
		System.out.println(Math.random()*12); //prints a random number between 0 and 11 
		
		//learn exclusive or 
		
		//trace switch statement may be expected for exam 
		int day = 2;
		switch(day) {
			case 1: 
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("Weekday"); break;
			case 0:
			case 6: System.out.println("Weekend");
		}
		
		
	//conditional operator or ternary operator
		
		int age = 16; 
		
		if(age >= 18) 
			System.out.println("ticket = 20");
		else
			System.out.println("ticket = 10");
		
		//The above if else block can be executed in one line using the ternary operator
		
		System.out.println((age >= 18)? "ticket = 20" : "ticket = 30");
		
		//Max, Min and Abs 
		System.out.println(Math.max(3, 1.0)); //prints 3.0(double data type)
		
		//Trigonometric Functions
		System.out.println(Math.toDegrees(Math.PI / 2));
		System.out.println(Math.toRadians(30));
		System.out.println(Math.sin(0));
		System.out.println(Math.sin(Math.toRadians(270)));
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.sin(Math.PI/6));
		System.out.println(Math.cos(0));
		System.out.println(Math.cos(Math.PI/2));
		System.out.println(Math.cos(Math.PI/6));
		System.out.println(Math.asin(0.5));
		System.out.println(Math.acos(0.5));
		System.out.println(Math.atan(1));
		
		char ch = 'a';
		System.out.println(++ch);
		
		//implicit and explicit casting
		
		int i = 'a'; //implicit casting //i stores the ascii value of a
		System.out.println(i);
		System.out.println((int)'a'); //explicit casting 
		
		
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is an uppercase letter");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is a lowercase letter");
		else if (ch >= '0' && ch <= '9')
			System.out.println(ch + " is a numeric character");
		
		
		if(Character.isLetter(ch)){
			System.out.println(ch + "is a letter" );
		}

	  

	
	}

}
