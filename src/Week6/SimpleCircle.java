package Week6;

public class SimpleCircle {
	// Define the circle class with two constructors
		
		  private double radius;

		  /** Construct a circle with radius 1 */
		  SimpleCircle() {
				  radius = 1;
		  }

		  /** Construct a circle with a specified radius */
		  SimpleCircle(double newRadius) {
		    if(radius > 0) {
		    	setRadius(newRadius);
		    }
		  }
		  
		  //Define get radius and return 1 if radius is not positive
		  double getRadius() {
			  if(radius > 0)
				  return radius;
			  else
				  return 1;
		  }
		  //Define get area and Pi if radius is not positive
		  /** Return the area of this circle */
		  double getArea() {
			  if (radius >0)
				  return radius * radius * Math.PI;
			  else
				  return 1;
		  }
		  
		//Define get perimeter and return 2*Pi if radius is not positive
		  /** Return the perimeter of this circle */
		  double getPerimeter() {
		    return 2 * radius * Math.PI;
		  }

		  /** Set a new radius for this circle */
		  void setRadius(double newRadius) {
			  if(radius > 0) {
				  	radius = newRadius;
			  }
			  else {
				  radius = 1;
			  }
		  }
}
