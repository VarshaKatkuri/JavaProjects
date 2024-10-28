/*(Math: pentagonal numbers) A pentagonal number is defined as for
and so on. So, the first few numbers are Write the
following method that returns a pentagonal number:
public static int getPentagonalNumber(int n)
Write a test program that displays the first 100 pentagonal numbers with 10 numbers on each line
*/

package Practice;

public class MethodsPentagonalNumbers {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.printf("%10d", getPentagonalNumber(i));
			
			if(i%10==0) {
				System.out.printf("\n");
			}
		
		}
		
	}
	
	public static int getPentagonalNumber(int n) {
		n = n*((3*n) - 1)/2;
		return n;
		
	}

}
