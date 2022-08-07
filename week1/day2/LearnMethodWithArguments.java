package week1.day2;

public class LearnMethodWithArguments {

	/*
	 * declare Instance variables studentName rollNo collegeName markScored ccpa
	 * 
	 * Create a class Report and create object for student class in main method and
	 * print all the variables
	 * 
	 */
	/*
	 * String studentName = "Ramu"; int rollNo = 12; String collegeName = "Abc"; int
	 * markScored = 80; float ccpa = 8.0f;
	 */
	int num;
	String n;
	float percentage;

	public void studentName(String name) {

		System.out.println(name);
	}

	public void rollNo(int rn) {
		System.out.println(rn);
	}

	public String collegeName(String colName) {
		System.out.println(colName);
		return colName;
	}

	public void marksScored(int mark) {
		System.out.println(mark);
	}

	public void ccpa(float ccpa) {
		System.out.println(ccpa);
	}

	public float ccpa1() {
		float ccpa1 = 9.0f;
		return ccpa1;
	}

	public static void main(String[] args) {
		LearnMethodWithArguments studentDetails = new LearnMethodWithArguments();
		studentDetails.studentName("Ramu");
		studentDetails.ccpa(8.0f);
		studentDetails.collegeName("ABC");
		studentDetails.rollNo(12);
		studentDetails.marksScored(80);
		studentDetails.studentName("Somu");
		studentDetails.ccpa(9.0f);
		studentDetails.collegeName("CBC");
		studentDetails.rollNo(20);
		studentDetails.marksScored(70);

	}

}
