//파워자바 133p 6번
//2부터 100까지 사이에 있느느 모든 소수를 찾는 프로그램

public class FindPrimeNmber{
	public static void main(String[] args){
		boolean check = true;
		for(int i = 2;i <= 100;i++){
			if(i == 2){		//2를 예외로 주는 것으로 했음.
				System.out.println(i);
				continue;
			}
			for(int j = 2;j*j <= i;j++){	//j*j<=i를 한 이유는 2*2=4인데 그러면 for문이 실행되지 않아 4가 소수로 나옴.
				if(i%j==0){		//약수가 존재한다면 소수가 아니므로 false값을 넣고, 더이상 검사할 필요가 없으므로 반복문 탈출. 없다면 초기의 true값으로 반복문 탈출
					check = false;
					break;
				}
			}
			if(check == true)	//true값일 때 소수이다.
				System.out.println(i);
			check = true;	//다음 반복문으로 넘어가기 전에 check값을 true로 초기화
		}
	}
}