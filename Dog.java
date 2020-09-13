//1.24 파워자바 221p 1번
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
		// System.out.println("이름 : "+name
							// +"\n종류 : "+breed
							// +"\n나이 : "+age);
	// }
}