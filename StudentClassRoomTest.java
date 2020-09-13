//1.24 ~ 1.25 선생님 문제
/*
	학생 Student : class
		private field / getter / setter / constructor
		name : String
		age : int
		kor : int
		eng : int
		math : int
	학생 점수 계산기 StudentCal : class
		public sumScore(Student : 매개변수) : int(반환)
		public avgScore(Student : 매개변수) : int(반환)
	학급 ClassRoom : class
		private field / getter / setter
		학생1 student1 : Student
		학생2 student2 : Student
		학생3 student3 : Student
		학생 점수 게산기 cal : StudentCal
		public sumStudentsScore() : int
		public avgStudentsScore() : int		//각 학생의 점수 평균의 평균
		public printsAllStudents() : void	
*/

class Student{
	private String name;
	private int age;
	private int kor;	//국어점수
	private int eng;	//영어점수
	private int math;	//수학점수
	
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

	//생성자
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
	
	//학생들의 총점 합계
	public int sumStudentsScore(){
		return (cal.sumScore(student1) + cal.sumScore(student2) + cal.sumScore(student3));
	}
	//학생들 평균의 평균
	public int avgStudentsScore(){
		return (cal.avgScore(student1) + cal.avgScore(student2) + cal.avgScore(student3)) / 3;
	}
	//학생들 정보 출력
	public void printsAllStudents(){
		System.out.println("이름 : " + student1.getName() + "\n나이 : " + student1.getAge() 
				+ "\n국어점수 : " + student1.getKor() + "\n영어점수 : " + student1.getEng() 
				+ "\n 수학점수 : " + student1.getMath() + "\n");
		System.out.println("이름 : " + student2.getName() + "\n나이 : " + student2.getAge() 
				+ "\n국어점수 : " + student2.getKor() + "\n영어점수 : " + student2.getEng() 
				+ "\n 수학점수 : " + student2.getMath() + "\n");
		System.out.println("이름 : " + student3.getName() + "\n나이 : " + student3.getAge() 
				+ "\n국어점수 : " + student3.getKor() + "\n영어점수 : " + student3.getEng() 
				+ "\n 수학점수 : " + student3.getMath() + "\n");
	}	
}

public class StudentClassRoomTest{
	public static void main(String[] args){
		Student s1 = new Student("Alice", 17, 70, 87, 90);
		Student s2 = new Student("Kim", 18, 85, 80, 92);
		Student s3 = new Student();
		StudentCal cal = new StudentCal();		
		
		ClassRoom room1 = new ClassRoom(s1, s2, s3, cal);
		
		//room1학생들 출력
		room1.printsAllStudents();
		
		//room1의 student3를 설정
		room1.setStudent3("Nell", 19, 60, 72, 90);
		s3 = room1.getStudent3();					//그 student3를 s3로 받아옴.
		
		//room1학생드르 출력
		room1.printsAllStudents();

		System.out.println("room1의 sudent1의 점수의 총점 : " + cal.sumScore(room1.getStudent1())
							+ "\nroom1의 student1의 점수의 평균 : " + cal.avgScore(room1.getStudent1()) + "\n");
		
		
		System.out.println("room1의 학생들의 점수의 총합 : " + room1.sumStudentsScore()
							+ "\nroom1의 학생들 점수의 평균의 평균 : " + room1.avgStudentsScore() + "\n");
	}
}