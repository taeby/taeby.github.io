//�Ŀ��ڹ� 133p 6��
//2���� 100���� ���̿� �ִ��� ��� �Ҽ��� ã�� ���α׷�

public class FindPrimeNmber{
	public static void main(String[] args){
		boolean check = true;
		for(int i = 2;i <= 100;i++){
			if(i == 2){		//2�� ���ܷ� �ִ� ������ ����.
				System.out.println(i);
				continue;
			}
			for(int j = 2;j*j <= i;j++){	//j*j<=i�� �� ������ 2*2=4�ε� �׷��� for���� ������� �ʾ� 4�� �Ҽ��� ����.
				if(i%j==0){		//����� �����Ѵٸ� �Ҽ��� �ƴϹǷ� false���� �ְ�, ���̻� �˻��� �ʿ䰡 �����Ƿ� �ݺ��� Ż��. ���ٸ� �ʱ��� true������ �ݺ��� Ż��
					check = false;
					break;
				}
			}
			if(check == true)	//true���� �� �Ҽ��̴�.
				System.out.println(i);
			check = true;	//���� �ݺ������� �Ѿ�� ���� check���� true�� �ʱ�ȭ
		}
	}
}