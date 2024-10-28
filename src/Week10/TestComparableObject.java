package Week10;

import java.util.Arrays;

public class TestComparableObject {

	public static void main(String[] args) {
		GeometricObject[] list = {new RectangleFromSimpleGeometricObject(10.15, 11.55),
				new RectangleFromSimpleGeometricObject(31.22, 12.44),
				new CircleFromSimpleGeometricObject(13.45),
				new CircleFromSimpleGeometricObject(10.15)};
		
		Arrays.sort(list);
		for(GeometricObject object:list) {
			System.out.println(object);
			System.out.println();
		}

	}

}
