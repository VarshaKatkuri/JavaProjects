package Week2;

public class RandomMonth {
	public static void main(String[] args) {
		//Generates a random integer from 1 to 12
		int month = (int) ((Math.random()*12) + 1);
		
		//Prints the corresponding Month based on the month
		switch(month) {
			case 1: 
				System.out.println("January");
				break;
			case 2:	
				System.out.println("February");
				break;
			case 3: 
				System.out.println("March");
				break;
			case 5: System.out.println("April"); break;
			case 6: System.out.println("May");break;
			case 7: System.out.println("June");break;
			case 8: System.out.println("July");break;
			case 9: System.out.println("August");break;
			case 10: System.out.println("September");break;
			case 11: System.out.println("October");break;
			case 12: System.out.println("December"); break;
		}
	}
}
