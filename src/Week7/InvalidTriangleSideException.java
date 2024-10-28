package Week7;

public class InvalidTriangleSideException extends Exception {
	private double side;

	  /** Construct an exception */
	  public InvalidTriangleSideException(double side) {
	    super("Invalid side " + side);
	    this.side = side;
	  }

	  /** Return the radius */
	  public double getSide() {
	    return side;
	  }
}
