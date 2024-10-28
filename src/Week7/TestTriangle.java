package Week7;


public class TestTriangle {

	public static void main(String[] args) {
		try {
			TriangleFromSimpleGeometricObject triangle1 = new TriangleFromSimpleGeometricObject(3,5,5, "Blue", true);
			System.out.println("\nA rectangle " + triangle1);
			
		//	triangle1.setSide1(4);
			//System.out.println("\nA rectangle " + triangle1);
			
		//	triangle1.setSide1(-4);
			TriangleFromSimpleGeometricObject triangle2 = new TriangleFromSimpleGeometricObject(3,4,5, "Purple", true);
			System.out.println("\nA rectangle " + triangle2);
		
		}
		catch (InvalidTriangleSideException ex) {
			System.out.println(ex);
		}
		catch(IllegalArgumentException ex1) {
			System.out.println(ex1);
		}
		catch(Exception ex2) {
			System.out.println(ex2);
		}
		System.out.println("Number of objects created: " +
		      TriangleFromSimpleGeometricObject.getNumberOfObjects());
	
	}

}
