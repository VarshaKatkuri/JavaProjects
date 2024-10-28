package Practice;

public class KilotoPoundsTwoColumns {

	public static void main(String[] args) {
		System.out.printf("%-15s%-20s%-15s%-15s", "Kilograms", "Pounds", "Kilograms", "Pounds");
		int j = 20;
		for(int i = 1; i< 200; i=i+2) {
			
			System.out.printf("\n");
			System.out.printf("%-15d%-20.1f%-15d%-15.1f", i, i*2.2, j, j*2.2);
			j=j+5;
		}
	}

}
