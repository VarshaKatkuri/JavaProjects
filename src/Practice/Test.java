package Practice;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		new Person().printPerson();
		new Student().printPerson();
//		Number x = new Integer(3);
//		System.out.println(x.intValue());
//		System.out.println(x.compareTo(new Integer(4)));
//		
//		Number x = new Integer(3);
//	    System.out.println(x.intValue());
//	    System.out.println(((Integer) x).compareTo(new Integer(4)));
//	    
	    System.out.println(1.0 / 0);
	    
	    long value = Long.MAX_VALUE + 1;
	    System.out.println(value);
	   
	    System.out.println(1/0);
		
		 }
		}
		class Student extends Person {
		 @Override
		public String getInfo() {
		return "Student";
		 }
		}
		class Person {
		public String getInfo() {
		return "Person";
		 }
		public void printPerson() {
		 System.out.println(getInfo());
		 }
		
		Number numberRef = new Integer(0);
		Double doubleRef = numberRef.doubleValue();
		
	
}
