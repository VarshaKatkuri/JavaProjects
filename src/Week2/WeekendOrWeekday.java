package Week2;

import java.util.Scanner; 

public class WeekendOrWeekday {
	 public static void main(String[] args) {
		 // Create a Scanner Object
		 Scanner input = new Scanner(System.in);
		
		 
		 //Prompt the user to enter the amount of water in Kilogram
		 System.out.print("Enter the number of the day:  ");
		 int day = input.nextInt();
		 
		 //Check if the day entered is between 0 and 6 included
		 
		 if(day >=0 && day <= 6) {
			//Output if the day is weekday or weekend
			 System.out.println((day >= 1 && day <= 5)? "Weekday" : "Weekend");
		 }

		 else {
			 //If not display that the day entered can only be from 0 to 6
			 System.out.println("The day entered can be from 0 to 6");
		 }
	 }
}
