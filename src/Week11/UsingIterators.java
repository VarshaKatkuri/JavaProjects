package Week11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class UsingIterators {
	static Integer size = 500000;
	public static void main(String[] args) {
	
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			linkedList.add(i);
		}
		
		System.out.println("Start Iterator Test...");
		double startTime =  System.currentTimeMillis();
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		double endTime = System.currentTimeMillis();
		System.out.println("Iterator time completed in... "+ ((endTime- startTime)/1000) + " seconds.");
		double startTimeIndex = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			linkedList.get(i);
		}
		double endTimeIndex = System.currentTimeMillis();
		System.out.println("Iterator time completed in... " + ((endTimeIndex- startTimeIndex)/1000) + " seconds.");
		

	}

}
