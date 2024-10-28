package Week5;

public class SmallestIndexOfLargestElement {

	public static void main(String[] args) {
		int[] mylist = {1,4,6,52,4,1};
		int max = 0;
		int maxIndex = 0;
		for(int i = 0; i<mylist.length; i++) {
			if(mylist[i] > max) {
				max = mylist[i];
				maxIndex = i;
			}
			
		}
		System.out.printf("The index of the largest number "+ max + " is " + maxIndex);

	}
}
