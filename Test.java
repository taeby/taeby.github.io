import java.util.*;
public class Test {
	int add(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.add(10, 20);
		
		
		Test.minus(30, 20);
		
		Random r = new Random();
		r.nextInt(100);
		
		Math.random(6);
	}
}











