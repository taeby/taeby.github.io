//1.28 �Ŀ��ڹ� 237p ����3��
import java.util.*;

public class StudentAvg{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ�: ");
		int studentTotal = input.nextInt();
		int[] studentScore = new int[studentTotal];
		int total = 0;
		
		for(int i = 0; i < studentScore.length; i++){		
			while(true){
				System.out.print("�л�" + (i + 1) + "�� ������ �Է��Ͻÿ� : ");
				studentScore[i] = input.nextInt();
				if(studentScore[i] <= 100 && studentScore[i] >= 0){
					break;
				}
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
			}
			total += studentScore[i];
		}		
		
		System.out.println("���� ����� " + total / studentScore.length + " �Դϴ�.");
		
	}
}

/*
	int i = 0;
	while(i < studentScore.length){
		System.out.print("�л�" + (i + 1) + "�� ������ �Է��Ͻÿ� : ");
		studentScore[i] = input.nextInt();
		if(studentScore[i] >= 0 && studentScore[i] <= 100){
			total += studentScore[i];
			i++;
			continue;
		}
		System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
	}

*/