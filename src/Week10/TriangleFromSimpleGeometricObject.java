package Week10;


import Week7.InvalidTriangleSideException;

public class TriangleFromSimpleGeometricObject  extends GeometricObject {
	 private double side1 =1.0;
	 private double side2 = 1.0;
	 private double side3= 1.0;
	private static int numberOfObjects = 0;

	  public TriangleFromSimpleGeometricObject() {
	  }

	  public TriangleFromSimpleGeometricObject (
	      double side1, double side2, double side3) throws InvalidTriangleSideException{
		 
		  setSide1(side1);
		  setSide2(side2);
		  setSide3(side3);
		  numberOfObjects++;
		 
	  }

	  public TriangleFromSimpleGeometricObject(
	      double side1, double side2, double side3, String color, boolean filled) throws InvalidTriangleSideException{
		
		  setSide1(side1);
		  setSide2(side2);
		  setSide3(side3);
		  setColor(color);
		  setFilled(filled);
		  numberOfObjects++;
	  }

	  /** Set a new side1 
	 * @throws InvalidTriangleSideException */
	  public void setSide1(double side1) throws IllegalArgumentException{
	    if(side1<0) 
	    	throw new IllegalArgumentException("Side cannot be negative");
	    this.side1 = side1;
	  }
	  /** Set a new side2 
	 * @throws InvalidTriangleSideException */
	  public void setSide2(double side2)  throws IllegalArgumentException{
	    if(side2<0) 
	    	throw new IllegalArgumentException("Side cannot be negative");
	    this.side2 = side2;
	    
	  }
	  /** Set a new side3 */
	  public void setSide3(double side3) throws IllegalArgumentException{
	    if(side3<0) 
	    	throw new IllegalArgumentException("Side cannot be negative");
	    this.side3 = side3;
	  }
	  /** Return side1 */
	  public double getside1() {
	    return side1;
	  }
	  
	  /** Return side2 */
	  public double getside2() {
	    return side2;
	  }
	  
	  /** Return side3 */
	  public double getside3() {
	    return side2;
	  }

	  /** Return area */
	  public double getArea() {
		 double perimeter = this.getPerimeter(); 
		 perimeter = perimeter/2;
	    return Math.sqrt((perimeter)*(perimeter - side1)*(perimeter - side2)*(perimeter - side3));
	  }

	  /** Return Perimeter */
	  public double getPerimeter() {
	    return (side1+side2+side3);
	  }
	  
	  /** Return numberOfObjects */
	  public static int getNumberOfObjects() {
	    return numberOfObjects;
	  }
	  
	  public String toString() {
		  return super.toString() + ". The Triangle with 3 sides are "
				  				  + side1+ ", "+ side2+  ", "+ side3
				  				  + " Area: "+ getArea()
				  				  + " Perimeter: "+ getPerimeter();
	  }

}

