	public class Circle {
	private double radius;
	private static final double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double square(double number) {
		return number * number;
	}
	public double getArea() {
		return square(radius) * PI;
	}
	public double getPerimeter() {
		return radius * 2 * PI;
	}
	public static double getPi() {
		return PI;
	}
	public static void main(String[] args) {
		Circle c = new Circle(3.0);
		c.square(10.0);
		getPi();
	}
}









