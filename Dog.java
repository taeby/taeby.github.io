//1.24 �Ŀ��ڹ� 221p 1��
class Dog{
	private String name;
	public String breed;
	private int age;
	
	public Dog(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public Dog(String name, int age){
		this(name, null, age);
	}
	// public void printDog(){
		// System.out.println("�̸� : "+name
							// +"\n���� : "+breed
							// +"\n���� : "+age);
	// }
}