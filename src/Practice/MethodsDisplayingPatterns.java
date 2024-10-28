/*Displaying patterns) Write a method to display a pattern as follows:
1
2 1
3 2 1
...
n n-1 ... 3 2 1
The method header is
public static void displayPattern(int n)*/


package Practice;

public class MethodsDisplayingPatterns {

	public static void main(String[] args) {
		
		displayPattern(10);

	}
	
	public static void displayPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--) {
			System.out.printf("%5s", " ");
			
			}
			for(int k = i; k > 0; k--) {
				System.out.printf("%5d", k);
			}
			System.out.printf("\n");
		}
		
	}

}
