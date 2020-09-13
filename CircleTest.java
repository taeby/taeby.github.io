class Circle {
	int radius;
	public static final double PI = 3.14;
	
	public Circle(int r) {
		radius = r;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(c.getArea());
		System.out.println(Circle.PI);
		
		System.out.println(Circle.PI / 2);
	}
}