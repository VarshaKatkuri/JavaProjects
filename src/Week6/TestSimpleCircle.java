package Week6;

public class TestSimpleCircle {
	  /** Main method */
	  public static void main(String[] args) {
	    
		  //Create a rectangle with width 4 and height 40
		  SimpleCircle circle1 = new SimpleCircle();
		  //System.out.println("The width of the rectangle is "  + circle1() + " is " + circle1.getArea());
		  System.out.println("The area of the circle of radius "  + circle1.getRadius() + " is " + circle1.getArea());

	    //set radius of -25 and print the default value of radius and area
	    circle1.setRadius(-25);
	    System.out.println("The area of the circle of radius " 
	    					+ circle1.getRadius() + " is " + circle1.getArea());
	  
	    //create another object of circle and pass -100 as radius and print the default value of radius and area
	    SimpleCircle circle2 = new SimpleCircle(-100);
	    System.out.println("The area of the circle of radius " + 
	    					circle2.getRadius() + " is " + circle2.getArea());
	    //set radius to -200 and print teh default values
	    circle2.setRadius(-200); 
	    System.out.println("The area of the circle of radius " + 
				circle2.getRadius() + " is " + circle2.getArea());

	  }
}

	