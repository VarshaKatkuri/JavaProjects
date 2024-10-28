package Practice;

public class KilogramstoPounds {

	public static void main(String[] args) {
		//print the header row 
		System.out.printf("%-15s%-15s", "Kilograms", "Pounds");
		for(int i=1; i<200; i++)
		{
			System.out.printf("\n");
			System.out.printf("%-15d", i);
			System.out.printf("%-15.1f", 2.2*i);
			
		}

	}	

}
