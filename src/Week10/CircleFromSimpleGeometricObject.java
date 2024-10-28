package Week10;


public class CircleFromSimpleGeometricObject 
extends GeometricObject {
	 private double radius;

	  /** The number of the objects created */
	  private static int numberOfObjects = 0;

	  /** Construct a circle with radius 1 */
	  public CircleFromSimpleGeometricObject() {
	    this(1.0);
	  }

	  /** Construct a circle with a specified radius */
	  public CircleFromSimpleGeometricObject(double newRadius) {
	    setRadius(newRadius);
	    numberOfObjects++;
	  }

	  /** Return radius */
	  public double getRadius() {
	    return radius;
	  }
	  /** Set a new radius */
	  public void setRadius(double newRadius)
	      throws IllegalArgumentException {
	    if (newRadius < 0)
	    	throw new IllegalArgumentException("Radius cannot be negative");
	    radius = newRadius;
	       
	  }

	  /** Return numberOfObjects */
	  public static int getNumberOfObjects() {
	    return numberOfObjects;
	  }

	
	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public String toString() {
		  return super.toString() + "The Circle with radius is "
				  				  + radius + ", "
				  				  + " Area: "+ getArea()
				  				  + " Perimeter: "+ getPerimeter();
	  }
	
	
}
