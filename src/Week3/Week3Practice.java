package Week3;
import java.util.Scanner;


public class Week3Practice {
	public static void main(String[] args) {
		String name = "Welcome to Java";
		System.out.println(name.indexOf('o')); //prints the index of first occurrence of o i.e. 4 
		System.out.println(name.indexOf('o', 5)); //prints the index of the occurrence of character 'o' after index 5
		System.out.println(name.indexOf("to")); //prints the index of the occurrence of to in the given string
		System.out.println(name.indexOf("to", -1)); //prints the index of the occurrence of to from backwards
		System.out.println(name.lastIndexOf('o')); // prints the last occurrence of o 
		System.out.println(name.lastIndexOf('a')); // prints the last occurrence of a
		
		
		//Finding a character or a Substring in a string
		String myName = "Varsha Katkuri";
		int indexSeperator = myName.indexOf(" ");
		String firstName =  myName.substring(0, indexSeperator);
		String lastName = myName.substring(indexSeperator+1);
		System.out.println(firstName + lastName);
		
		//parseint (Conversion between strings and numbers)
		int intValue = Integer.parseInt("6");
		String doubleString = "5.6";
		System.out.println(intValue);
		double doubleValue = Double.parseDouble(doubleString);
		System.out.println(doubleValue);
		
		//int to string conversion
		String s = intValue + ". Varsha"; 
		String s2 = intValue + ""; 
		System.out.println(s);
		System.out.println(s2);

		
		//printf can be used if the data has to be printed in a specific format, for instance a table sort of format 
		System.out.printf("%-10s%-10s%-10s%-10s%-10s", "Degrees", "Radians", "Sine", "Cosine", "Tangent"); // %-10s means the string reserves 10 characters 
		int degrees = 30;
		double radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, 
			      radians, Math.sin(radians), Math.cos(radians),
			      Math.tan(radians));
		
		degrees = 60;
	    radians = Math.toRadians(degrees);
	    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
		
	
		
				
		
		
		
		
	
	}

}
