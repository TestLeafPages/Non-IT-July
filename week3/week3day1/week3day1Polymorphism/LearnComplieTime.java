package week3day1Polymorphism;

public class LearnComplieTime {

	public void employee(int id) {
		System.out.println("EmpId: " + id);
	}

	public void employee(String empName, String companyName) {
		System.out.println("empName: " + empName + "company name:" + companyName);
	}

	public void employee(float salary) {
		System.out.println("Emp Salary :" + salary);

	}

	public void employee(String allowance) {
		System.out.println("Type of Allowance :" + allowance);
	}

	public static void main(String[] args) {
		LearnComplieTime overload=new LearnComplieTime();
		
		overload.employee(121);
		overload.employee(12322.3f);
		overload.employee("Food allowance");
		overload.employee("Vidya", "TL");
		

	}

}
