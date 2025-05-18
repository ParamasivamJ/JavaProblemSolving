package oops;

public class Circle {
	private double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	public static void main(String[] args) {
		Circle c1=new Circle(10);
		System.out.println(CircleProperties.getArea(c1));
		System.out.println(CircleProperties.returnref()); // obj ref returning method
	}

}