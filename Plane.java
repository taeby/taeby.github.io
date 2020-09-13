public class Plane {
	private String producer;
	private String model;
	private int passenger;
	private static int planes = 0;
	
	public Plane(String producer, String model, int passenger){
		this.producer = producer;
		this.model = model;
		this.passenger = passenger;
		planes++;
	}
	public Plane() {
		this("AirBus", "A380", 500);
	}
	
	public static int getPlanes() {
		return planes;
	}
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
}

	
