//1.24 ~ 1.25 ������ ����
/*
	�л� Student : class
		private field / getter / setter / constructor
		name : String
		age : int
		kor : int
		eng : int
		math : int
	�л� ���� ���� StudentCal : class
		public sumScore(Student : �Ű�����) : int(��ȯ)
		public avgScore(Student : �Ű�����) : int(��ȯ)
	�б� ClassRoom : class
		private field / getter / setter
		�л�1 student1 : Student
		�л�2 student2 : Student
		�л�3 student3 : Student
		�л� ���� �Ի�� cal : StudentCal
		public sumStudentsScore() : int
		public avgStudentsScore() : int		//�� �л��� ���� ����� ���
		public printsAllStudents() : void	
*/

class Student{
	private String name;
	private int age;
	private int kor;	//��������
	private int eng;	//��������
	private int math;	//��������
	
	public Student(String name, int age, int kor, int eng, int math){
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student(){
		
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
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
	public int getMath(){
		return math;
	}

}

class StudentCal{
	public int sumScore(Student student){
		return student.getKor() + student.getEng() + student.getMath();
	}
	public int avgScore(Student student){
		return sumScore(student) / 3;
	}
}

class ClassRoom{
	private Student student1;
	private Student student2;
	private Student student3;
	private StudentCal cal;

	//������
	public ClassRoom(Student student1, Student student2, Student student3, StudentCal cal){
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
		this.cal = cal;
	}
	public ClassRoom(){
		student1 = new Student();
		student2 = new Student();
		student3 = new Student();
		cal = new StudentCal();
	}
	
	public void setStudent1(Student s1){
		this.student1 = s1;
	}
	//setter
	public void setStudent1(String name, int age, int kor, int eng, int math){		
		student1.setName(name);
		student1.setAge(age);
		student1.setKor(kor);
		student1.setEng(eng);
		student1.setMath(math);
	}
	public void setStudent2(String name, int age, int kor, int eng, int math){
		student2.setName(name);
		student2.setAge(age);
		student2.setKor(kor);
		student2.setEng(eng);
		student2.setMath(math);
	}
	public void setStudent3(String name, int age, int kor, int eng, int math){
		student3.setName(name);
		student3.setAge(age);
		student3.setKor(kor);
		student3.setEng(eng);
		student3.setMath(math);
	}
	
	//getter
	public Student getStudent1(){
		return student1;
	}
	public Student getStudent2(){
		return student2;
	}
	public Student getStudent3(){
		return student3;
	}
	
	//�л����� ���� �հ�
	public int sumStudentsScore(){
		return (cal.sumScore(student1) + cal.sumScore(student2) + cal.sumScore(student3));
	}
	//�л��� ����� ���
	public int avgStudentsScore(){
		return (cal.avgScore(student1) + cal.avgScore(student2) + cal.avgScore(student3)) / 3;
	}
	//�л��� ���� ���
	public void printsAllStudents(){
		System.out.println("�̸� : " + student1.getName() + "\n���� : " + student1.getAge() 
				+ "\n�������� : " + student1.getKor() + "\n�������� : " + student1.getEng() 
				+ "\n �������� : " + student1.getMath() + "\n");
		System.out.println("�̸� : " + student2.getName() + "\n���� : " + student2.getAge() 
				+ "\n�������� : " + student2.getKor() + "\n�������� : " + student2.getEng() 
				+ "\n �������� : " + student2.getMath() + "\n");
		System.out.println("�̸� : " + student3.getName() + "\n���� : " + student3.getAge() 
				+ "\n�������� : " + student3.getKor() + "\n�������� : " + student3.getEng() 
				+ "\n �������� : " + student3.getMath() + "\n");
	}	
}

public class StudentClassRoomTest{
	public static void main(String[] args){
		Student s1 = new Student("Alice", 17, 70, 87, 90);
		Student s2 = new Student("Kim", 18, 85, 80, 92);
		Student s3 = new Student();
		StudentCal cal = new StudentCal();		
		
		ClassRoom room1 = new ClassRoom(s1, s2, s3, cal);
		
		//room1�л��� ���
		room1.printsAllStudents();
		
		//room1�� student3�� ����
		room1.setStudent3("Nell", 19, 60, 72, 90);
		s3 = room1.getStudent3();					//�� student3�� s3�� �޾ƿ�.
		
		//room1�л��帣 ���
		room1.printsAllStudents();

		System.out.println("room1�� sudent1�� ������ ���� : " + cal.sumScore(room1.getStudent1())
							+ "\nroom1�� student1�� ������ ��� : " + cal.avgScore(room1.getStudent1()) + "\n");
		
		
		System.out.println("room1�� �л����� ������ ���� : " + room1.sumStudentsScore()
							+ "\nroom1�� �л��� ������ ����� ��� : " + room1.avgStudentsScore() + "\n");
	}
}