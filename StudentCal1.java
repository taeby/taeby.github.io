import java.util.*;

public class StudentCal1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("�л��� ���� �Է��Ͻÿ�: ");
		int num = s.nextInt();
		int total = 0;
		double cal1;
		int[] cal = new int[num]; 
		for (int i = 0; i < cal.length; ){
			System.out.println("�л� " + (i+1) + "�� ������ �Է��Ͻÿ�: ");
			cal[i] = s.nextInt();
			if(cal[i] < 0 || cal[i] > 100 ){
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
			}
			else{
				i++;
			}
		}
		for (int i = 0; i < cal.length; i++)
			total += cal[i];
		cal1 = total / cal.length;
		System.out.println("���� ����� " + cal1 + "�Դϴ�.");
	}
}