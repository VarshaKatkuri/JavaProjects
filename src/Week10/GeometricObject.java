package Week10;

public abstract class GeometricObject implements Cloneable, Comparable<GeometricObject>{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	  
	  /** Construct a default geometric object */
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }
	
	  /** Construct a geometric object with the specified color 
	*  and filled value */
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }
	
	  /** Return color */
	  public String getColor() {
	    return color;
	  }
	
	  /** Set a new color */
	  public void setColor(String color) throws IllegalArgumentException{
		 if(color != "Blue" && color != "Red" && color != "White" && color != "Black")
		 throw new IllegalArgumentException("Color can only be Blue, Red, White or Black");
	    this.color = color;
	  }
	
	  /** Return filled. Since filled is boolean, 
	 its get method is named isFilled */
	  public boolean isFilled() {
	    return filled;
	  }
	
	  /** Set a new filled */
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }
	  
	  /** Get dateCreated */
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }
	  
	  @Override
	  /** Return a string representation of this object */
	  public String toString() {
	    return "created on " + dateCreated + "\ncolor: " + color + 
	  " and filled: " + filled + ".  ";
	  }
	  
	  @Override
		public int compareTo(GeometricObject o) {
			if(getArea() > o.getArea())
				return 1;
			else if (getArea() < o.getArea())
				return -1;
			else 
				return 0;
			
		}
	  
	  @Override /** Override the protected clone method defined in the Object class, and strengthen its accessibility */
	  public Object clone() throws CloneNotSupportedException {
		  return super.clone();
	  }
	  /** Abstract method getArea */
	  public abstract double getArea();

	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();
}
