/*
	Ŀ�����Ǳ�
	��ư => Ŀ��
	
	Ŀ�� Coffee : class
	private taste : String
	private name : String
	public getter/setter/constructor
	
	Ŀ�����Ǳ� CoffeeMachine : class
	public button(void) : Coffee
*/
class Coffee {
	private String taste;
	private String name;
	
	public Coffee(String taste, String name) {
		this.taste = taste;
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public String getName() {
		return name;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class CoffeMachineTest {
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeMachine();
		Coffee c = cm.button();
		System.out.println(c.getName() + " " + c.getTaste());
	}
}