package Week10;

public class TestCloneableObject {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		GeometricObject newObject1 = new RectangleFromSimpleGeometricObject(10.15, 11.55);
		//copies the reference
		GeometricObject newObject2 = newObject1; 
		//clone
		GeometricObject newObject3 = (GeometricObject) newObject1.clone();
		
		newObject1.setColor("Blue");
		newObject2.setColor("Red");
		
		System.out.println(newObject1);
		System.out.println();
		System.out.println(newObject2);
		System.out.println();
		System.out.println(newObject3);
		}
		catch(CloneNotSupportedException ex) {
			System.out.print(ex);
		}
	}

}
