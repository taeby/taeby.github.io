/*기타 문제
	커피자판기
	버튼 -> 커피가 나옴
	
	커피 Coffee : class
	taste : String
	name : String
	커피자판기 CoffeeMachine : class
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
		Coffee c = cm.button("자판기커피", "프로그래머를 갈아 넣은 맛");
		System.out.println(c.getName()+" "+c.getTaste());
	}
}