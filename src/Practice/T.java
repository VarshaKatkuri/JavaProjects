package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class T {
	
		  public static void main(String[] args) {
			
				    Apple a = new Apple();
				    System.out.println(a);
				    System.out.println("---------------");
				    
				    GoldenDelicious g = new GoldenDelicious(7);
				    System.out.println(g);
				    System.out.println("---------------");

				    Apple c = new GoldenDelicious(8);
				    System.out.println(c);
				  }
				}

				class Apple {
				  double weight;
				  
				  public Apple() {
				    this(1);
				    System.out.println("Apple no-arg constructor");
				  }
				  
				  public Apple(double weight) {
				    this.weight = weight;
				    System.out.println("Apple constructor with weight");
				  }
				  
				  @Override 
				  public String toString() {
				    return "Apple: " + weight;
				  }
				}

				class GoldenDelicious extends Apple {
				  public GoldenDelicious() {
				    this(5);
				    System.out.println("GoldenDelicious non-arg constructor");
				  }
				  
				  public GoldenDelicious(double weight) {
				    super(weight);
				    this.weight = weight;
				    System.out.println("GoldenDelicious constructor with weight");
				  }
				  
				  @Override 
				  public String toString() {
				    return "GoldenDelicious: " + weight;
				  }
			 
//				    Circle circle1 = new Circle(1);
//				    Circle circle2 = new Circle(2);
//
//				    swap1(circle1, circle2);
//				    System.out.println("After swap1: circle1 = " + 
//				    circle1.radius + " circle2 = " + circle2.radius);
//
//				    swap2(circle1, circle2);
//				    System.out.println("After swap2: circle1 = " + 
//				      circle1.radius + " circle2 = " + circle2.radius);
//				  }
//
//				  public static void swap1(Circle x, Circle y) {
//				    Circle temp = x;
//				    x = y;
//				    y = temp;
//				  }
//
//				  public static void swap2(Circle x, Circle y) {
//				    int temp = x.radius;
//				    x.radius = y.radius;
//				    y.radius = temp;
//				  }
				 
//		    List<Integer> arrayList = new ArrayList<>();
//		    arrayList.add(1); // 1 is autoboxed to an Integer object
//		    arrayList.add(2);
//		    arrayList.add(3);
//		    arrayList.add(1);
//		    arrayList.add(4);
//		    arrayList.add(0, 10);
//		    arrayList.add(3, 30);
//
//		    System.out.println("A list of integers in the array list:");
//		    System.out.println(arrayList);
//
//		    LinkedList<Object> linkedList = new LinkedList<>(arrayList);
//		    linkedList.add(1, "red");
//		    linkedList.removeLast();
//		    linkedList.addFirst("green");
//
//		    System.out.println("Display the linked list forward:"); 
//		    ListIterator<Object> listIterator = linkedList.listIterator();
//		    while (listIterator.hasNext()) {
//		      System.out.print(listIterator.next() + " ");
//		    }
//		    System.out.println();
//		  
//		    System.out.println("Display the linked list backward:");
//		    listIterator = linkedList.listIterator(linkedList.size());
//		    while (listIterator.hasPrevious()) {
//		      System.out.print(listIterator.previous() + " ");
//		    }
//		    
//		    
//		 // Create a HashMap
//		    Map<String, Integer> hashMap = new HashMap<>();
//		    hashMap.put("Perez", 30);
//		    hashMap.put("Washington", 31);
//		    hashMap.put("Lewis", 29);
//		    hashMap.put("Cook", 29);
//
//		    System.out.println("Display entries in HashMap");
//		    System.out.println(hashMap + "\n");
//
//		    // Create a TreeMap from the preceding HashMap
//		    Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//		    System.out.println("Display entries in ascending order of key");
//		    System.out.println(treeMap);
//
//		    // Create a LinkedHashMap
//		    Map<String, Integer> linkedHashMap =
//		      new LinkedHashMap<>(16, 0.75f, true);
//		    linkedHashMap.put("Perez", 30);
//		    linkedHashMap.put("Washington", 31);
//		    linkedHashMap.put("Lewis", 29);
//		    linkedHashMap.put("Cook", 29);
//
//		    // Display the age for Lewis
//		    System.out.println("\nThe age for " + "Lewis is " +
//		      linkedHashMap.get("Lewis"));
//
//		    System.out.println("Display entries in LinkedHashMap");
//		    System.out.println(linkedHashMap);
//		    
//		    // Display each entry with name and age
//		    System.out.print("\nNames and ages are ");
//		    treeMap.forEach(
//		      (name, age) -> System.out.print(name + ": " + age + " "));
		  
		  }
				  class Circle {
					  int radius;

					  Circle(int newRadius) {
					    radius = newRadius;
					  }
		   
}
