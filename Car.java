public class Car {
	private String color;
	private int speed;
	private int gear;
	
	public int id;
	public static int numberOfCars = 0;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		
		numberOfCars++;
		id = numberOfCars;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car("Red", 0, 1);
		System.out.println(c.id);
	}
}






