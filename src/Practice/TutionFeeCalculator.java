
package Practice;

	/**(Financial application: computing future tuition) Suppose that the tuition for a
	university is $10,000 this year and increases 5% every year. Write a program that
	computes the tuition in ten years and the total cost of four years’ worth of tuition
	starting ten years from now.
 * 
 */
public class TutionFeeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double fee = 10000;
		double totalCostFourYears= 0;
		for(int i = 1; i<= 10; i++) {
			fee = fee + (fee*(0.05));
		}
		System.out.printf("The total fees for 10 years is %1.2f", fee);
		//Calculating cost for 4 years:
		for(int i=1; i<=4; i++) {
			totalCostFourYears += fee;
			fee = fee+(fee*(0.05));
		}
		System.out.printf("\n ");
		System.out.printf("The cost of 4 years' worth of tuition starting ten years from now is %1.2f", totalCostFourYears);

	}

}
