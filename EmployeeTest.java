class Employee {
	private String name;
	private double salary;
	
	private static int count = 0;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++;
	}
	
	@Override
	protected void finalize() {
		count--;
	}
	
	public static int getCount() {
		return count;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("��ö��", 35000);
		Employee e2 = new Employee("�ּ�ö", 50000);
		Employee e3 = new Employee("��öȣ", 20000);
		
		e1 = null;
		e2 = null;
		e3 = null;
		
		System.out.println(Employee.getCount());
	}
}





