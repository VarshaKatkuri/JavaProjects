package Week6;

public class TheRectangleClass {
	
	  private double width;
	  private double height;

	  /** The number of the objects created */
	  static int numberOfObjects = 0;

	  /** Construct a circle with radius 1 */
	  TheRectangleClass() {
	    width = 1.0;
	    height = 1.0;
	    //numberOfObjects++;
	  }

	  /** Construct a circle with a specified radius */
	  TheRectangleClass(double width, double height) {
	    setWidth(width);
	    setHeight(height);
	  }
	  
	  /** Set Width**/
	  void setWidth(double newWidth) {
		  if(newWidth > 0) {
			  width = newWidth;
		  }
		  else {
			  width = 1;
		  }
	  }
	  
	  /** Set Height **/
	  void setHeight(double newHeight) {
		  if(newHeight > 0) {
			  height = newHeight;
		  }
		  else {
			  height = 1;
		  }
	  }
	  
	//Define get width and return 1 if width is not positive
	  double getWidth() {
			  return width;
	  }
	//Define get height and return 1 if height is not positive
	  double getHeight() {
			  return height;
	  }
	
	  /** Return the area of the rectangle  */
	  double getArea() {
			  return width * height;
	  }
	  
	  /** Return the perimeter of this rectangle */
	  double getPerimeter() {
	    return 2 * (width + height);
	  }
}
