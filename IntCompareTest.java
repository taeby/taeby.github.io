class IntCompareUtility {
	public static int compareInt(int a, int b) {
		if(a > b) {
			return 1;
		} else if (a == b) {
			return 0;
		} else {
			return -1;
		}
	}
}

public class IntCompareTest {
	public static void main(String[] args) {
		System.out.println(IntCompareUtility.compareInt(10, 5));
	}
}