public class StringTest {
	public static void main(String[] args) {
		String proverb = "A barking Dog";
		
		System.out.println("���ڿ��� ���� = " + proverb.length());
		
		System.out.println(proverb.concat(" never Bites!"));
		System.out.println(proverb.replace('A', 'a'));
		System.out.println(proverb.substring(2, 5));
		System.out.println(proverb.toUpperCase());
	}
}