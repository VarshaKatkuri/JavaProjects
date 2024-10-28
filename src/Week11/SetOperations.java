package Week11;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class SetOperations {
	public static void main(String[] args) {
		
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Jake");
		set1.add("Blake");
		set1.add("Kevin");
		set1.add("Michael");
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
	
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");
		LinkedHashSet<String> set3 = (LinkedHashSet<String>)set1.clone();
		
		set3.addAll(set2);
		System.out.println("Union is: "+ set3);
		
		LinkedHashSet<String> set4 = (LinkedHashSet<String>)set1.clone();
		set4.retainAll(set2);
		System.out.println("Intersection is: "+ set4);
		
		
		LinkedHashSet<String> set5 = (LinkedHashSet<String>)set3.clone();
		//set5.removeAll(set2);
		
		set5.removeAll(set4);
		System.out.println("Difference is: "+ set5);

	}


}
