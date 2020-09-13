class Car {
	private String color;
	private int speed;
	private int gear;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	public Car() {
	}
	
	@Override
	public String toString() {
		return "Color : " + color
				+ "\nSpeed: " + speed
				+ "\nGear: " + gear
				+ "\n---------------";
	}
}
public class CarTest {
	public static void main(String[] args) {
		// Car c1 = new Car("Blue", 100, 0);
		Car c2 = new Car();
		
		// System.out.println(c1);
		System.out.println(c2);
	}
}