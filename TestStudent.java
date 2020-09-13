class Student {
	String name;
	String studentNumber;
	String major;
	int grade;
	int courseScore;
	
	public Student(String name, String studentNumber,
					String major, int grade, int courseScore) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.major = major;
		this.grade = grade;
		this.courseScore = courseScore;
	}
}
class UnderGraduate extends Student {
	String club;
	
	public UnderGraduate(String name, String studentNumber,
					String major, int grade, int courseScore, String club) {
		super(name, studentNumber, major, grade, courseScore);
		this.club = club;
	}
}
enum GraduateType{
	Education,
	Research
}
class Graduate extends Student {
	GraduateType type;
	double scholarshipRate;
	
	public Graduate(String name, String studentNumber,
					String major, int grade, int courseScore
					,GraduateType type, double scholarshipRate) {
		super(name, StudentNumber, major, grade, courseScore);
		this.type = type;
	}
	@Override
	public String toString() {
		return name + " " + StudentNumber + " " + major + " "
				+ grade + " " + courseScore + " "
				+ type + " " + scholarshipRate;
	}
}
public class TestStudent {
	public static void main(String[] args) {
		Graduate g = new Graduate("홍길동", "19-123456", "간호학과"
									, 1, 17, GraduateType.Research, 0.9);
		System.out.println(g);
	}
}