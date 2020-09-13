import java.util.*;

public class StudentCal1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("학생의 수를 입력하시오: ");
		int num = s.nextInt();
		int total = 0;
		double cal1;
		int[] cal = new int[num]; 
		for (int i = 0; i < cal.length; ){
			System.out.println("학생 " + (i+1) + "의 성적을 입력하시오: ");
			cal[i] = s.nextInt();
			if(cal[i] < 0 || cal[i] > 100 ){
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
			}
			else{
				i++;
			}
		}
		for (int i = 0; i < cal.length; i++)
			total += cal[i];
		cal1 = total / cal.length;
		System.out.println("성적 평균은 " + cal1 + "입니다.");
	}
}