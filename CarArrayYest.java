class Car{
	 public int speed;
	 public int gear;
	 public String color;
	 
	 public Car(){
		speed = 0;
		gear = 1;
		color = "red";
		}
	public void speedIp(){
		speed = speed +1;
		}
	public String toString(){
		return "�ӵ�:"+speed+"���"+gear+"����"+color;
		}
	}
	
	public class CarArrayYest{
		public static void main(String[] args){
			final int NUM_CARS = 5;
			Car[] cars = new Car[NUM_CARS];
			for (int i=0;i<cars.length;i++)
				cars[i] = new Car();
			for (int i=0;i<cars.length;i++)
				cars[i].speedIp();
			for (int i=0;i<cars.length;i++)
				System.out.println(cars[i]);
			}
	}