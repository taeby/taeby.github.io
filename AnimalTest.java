abstract class Animal {
	String name;
	int age;
	
	abstract void makeSound();
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("³Ä¿ë");
	}
	void scratch() {
		System.out.println("¹Ú¹Ú");
	}
}
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("¸Û¸Û");
	}
}
class Human extends Animal {
	@Override
	void makeSound() {
		System.out.println("¾È³çÇÏ¼¼¿ä");
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
