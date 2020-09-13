/* ÇĞ»ı Student : class
	private field /getter/setter/
	constructor(String,int,int,int,int)
	name: String
	age;int
	kor;int
	eng:int
	mat:int
	
	StudentCal : class
	public sumScore(Student):int
	public avgScore(Student):int
	
	ClassRoom : class
	private field / getter/ setter/constructor(Student,Student,Student,StudentCal)

*/

class Student{
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int mat;
	
	public Student(String name, int age, int kor, int eng, int mat){
		this.name=name;
		this.age=age;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMat(){
		return mat;
	}
	
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setKor(int kor){
		this.age=age;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public void setMat(int mat){
		this.mat=mat;
	}
}
		
class StudentCal{
	public int sumScore(Student c){
		return c.getKor()+c.getMat()+c.getEng();
	}	
		
	public int avgScore(Student a){
		return (a.getEng()+a.getKor()+a.getMat())/4;
	}
}

class ClassRoom {
	private Student student1;
	private Student student2;
	private Student student3;
	private StudentCal cal;
	
	public ClassRoom(Student student1,Student student2,Student student3,StudentCal cal){
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
		this.cal=cal;
	}
	
	public Student getStudent1(){
		return student1;
	}
	public Student getStudent2(){
		return student2;
	}
	public Student getStudent3(){
		return student3;
	}
	public StudentCal getStudentCal(){
		return cal;
	}
	
	public void setStudent1(Student student1){
		this.student1=student1;
	}
	public void setStudent2(Student student2){
		this.student2 = student2;
	}
	public void setStudent3(Student student3){
		this.student3=student3;
	}
	public void setStudentCal(StudentCal cal){
		this.cal=cal;
	}
	public int sumStudentScore(){
		return student1+student2+student3;
	}
	public int avgStudentScore(){
		return (student1+student2+student3)/3;
	}
	public void printAllStudents(){
		System.out.println(student1+""+studdent2+""+student3);
	}
	
}

public class StudentTest1{
	public static void main(String[] args){
		Student s1 = new Student("kim",20,80,90,95);
		Student s2 = new Student("Cho",30,88,92,91);
		Student s3 = new Student("Park",10,77,66,100);
		printAllStudents();
	}
}











