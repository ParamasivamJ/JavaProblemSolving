package oops;

public class CircleProperties {
	//utility classes
	static double getDiameter(Circle ref) {
		return 2*ref.getRadius();		
	}
	
	static double getArea(Circle ref) {
		return 3.14*(ref.getRadius()*ref.getRadius());
	}
	
	static double getParameter(Circle ref) {
		return 2*3.14*(ref.getRadius());
	}
	
	// method which returns object reference
	static CircleProperties returnref() {
		CircleProperties c1= new CircleProperties();
		return c1;
	}

}
