package Week2;
import java.util.Scanner; 

public class OrderThreeCities {
	public static void main(String[] args) {
		//Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter City 1:  ");
		String city1 = input.next();
		System.out.println("Enter City 2:  ");
		String city2 = input.next();
		System.out.println("Enter City 3:  ");
		String city3 = input.next();
		
		String temp = "";
		
		//System.out.println(city1.compareTo(city2));
		
		if(city1.compareTo(city2)> 0) {
			temp = city1;
			city1 = city2;
			city2 = temp;
		}
		
		if(city2.compareTo(city3) > 0) {
			temp = city2;
			city2 = city3;
			city3 = temp;
		}
		
		if(city1.compareTo(city3) > 0) {
			temp = city1;
			city1 = city3;
			city3 = temp;
		}
		System.out.println("The cities in order are : " + city1 + ", "+ city2 + ", " + city3);
	
	}

}
