abstract class Animal {
	String name;
	int age;
	
	abstract void makeSound();
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("�Ŀ�");
	}
	void scratch() {
		System.out.println("�ڹ�");
	}
}
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("�۸�");
	}
}
class Human extends Animal {
	@Override
	void makeSound() {
		System.out.println("�ȳ��ϼ���");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();
		Animal h = new Human();
		
		c.makeSound();
		((Cat)c).scratch();
		d.makeSound();
		h.makeSound();
	}
}
