package Week6;

public class TestRectangleClass {

	public static void main(String[] args) {
		  //Create a rectangle with width 4 and height 40
		  TheRectangleClass rectangle1 = new TheRectangleClass(4, 40);
		  System.out.println("The width, height, area, and perimeter of the rectangle1 are "  
				  				+ rectangle1.getWidth() + ", "+ rectangle1.getHeight() + ", "+ rectangle1.getArea()+ ", "
				  				+ rectangle1.getPerimeter());
		
		  //Create a rectangle with width 3.5 and height 35.9
		  TheRectangleClass rectangle2 = new TheRectangleClass(3.5, 35.9);
		  System.out.println("The width, height, area, and perimeter of the rectangle1 are "  
				  				+ rectangle2.getWidth() + ", "+ rectangle2.getHeight() + ", "+ rectangle2.getArea()+ ", "
				  				+ rectangle2.getPerimeter());
		  
	}

}
