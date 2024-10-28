package Week6;

public class Week6Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Circle {
		/** The radius of this circle */
		double radius = 1.0;
		
		/** Construct a circle object */
		Circle() {
		}
		
		/** Construct a circle object */
		Circle(double newRadius) {
		radius = newRadius;
		}
		
		/** Return the area of this circle */
		double getArea() {
		return radius * radius * 3.14159;
		}
		}
//Static methods? Would not require an instance to invoke it
}
