class Circle {
	private double radius;
	private String color;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius * radius * 3.14;
	}
}

class Cylinder extends Circle {
	private double height;
	public Cylinder() {
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea() * height;
	}
}

public class TestCylinder {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		System.out.println(c.getRadius() + " : " + c.getHeight());
		Cylinder c2 = new Cylinder(5.0, 3.0);
		System.out.println(c2.getArea() + " : " + c2.getVolume());
	}
}