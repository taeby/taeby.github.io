class Rantangle {
	int height;
	int width;
}
class Circle {
	int radius;
}
class MyUtility {
	public static final double PI = 3.14;
	public static double getPi() {
		return PI;
	}
	public static double getArea(Circle c)
	{
		return c.radius * c.radius * PI;
	}
	public static double getArea(Rectangle r) {
		return r.height * r.width;
	}
	public static int sum(int... i) {
		int sum = 0;
		for (int x : i) {
			sum += x;
		}
		return sum;
	}
	public static double kiloToMile(double kilo) {
		return kilo / 1.60934;
	}
}

public class UtilityTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 5;
		System.out.println(MyUtility.getCircleArea(c));
		System.out.println(MyUtility.sum(10, 20, 30, 40, 50));
		MyUtility.PI;
	}
}










