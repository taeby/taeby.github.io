//1.28 파워자바 237p 문제3번
import java.util.*;

public class StudentAvg{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오: ");
		int studentTotal = input.nextInt();
		int[] studentScore = new int[studentTotal];
		int total = 0;
		
		for(int i = 0; i < studentScore.length; i++){		
			while(true){
				System.out.print("학생" + (i + 1) + "의 성적을 입력하시오 : ");
				studentScore[i] = input.nextInt();
				if(studentScore[i] <= 100 && studentScore[i] >= 0){
					break;
				}
				System.out.println("잘못된 성적입니다. 다시 입력하세요.");
			}
			total += studentScore[i];
		}		
		
		System.out.println("성적 평균은 " + total / studentScore.length + " 입니다.");
		
	}
}

/*
	int i = 0;
	while(i < studentScore.length){
		System.out.print("학생" + (i + 1) + "의 성적을 입력하시오 : ");
		studentScore[i] = input.nextInt();
		if(studentScore[i] >= 0 && studentScore[i] <= 100){
			total += studentScore[i];
			i++;
			continue;
		}
		System.out.println("잘못된 성적입니다. 다시 입력하세요.");
	}

*/