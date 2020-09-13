class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public Singleton getInstance() {
		return instance;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s = new Singleton();
	}
}