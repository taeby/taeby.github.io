/*��Ÿ ����
	Ŀ�����Ǳ�
	��ư -> Ŀ�ǰ� ����
	
	Ŀ�� Coffee : class
	taste : String
	name : String
	Ŀ�����Ǳ� CoffeeMachine : class
	public button() : Coffee 
*/
class Coffee{
	private String taste;
	private String name;	
	
	public Coffee(String t, String n){
		taste = t;
		name = n;
	}
	public Coffee(){
		taste = null;
		name = null;
	}
	public String getTaste(){
		return taste;
	}
	public void setTaste(String t){
		taste = t;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
}

class CoffeeMachine{	
	public Coffee button(String n, String t){
		Coffee coffee = new Coffee(t,n);
		return coffee;
	}
	
}

public class CoffeeMachineTest{
	public static void main(String[] args){
		CoffeeMachine cm = new CoffeeMachine();
		Coffee c = cm.button("���Ǳ�Ŀ��", "���α׷��Ӹ� ���� ���� ��");
		System.out.println(c.getName()+" "+c.getTaste());
	}
}