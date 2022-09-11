package annotations;

import org.testng.annotations.Test;

public class LearnAttributes {

	@Test(priority=2)
	public void classA() {
		System.out.println("Class A Testcase");
	}
	@Test(priority=1)
	public void classN() {
		System.out.println("Class N Testcase");
	}
	@Test(priority=3)
	public void classC() {
		System.out.println("Class c Testcase");
	}
	@Test(priority=-1)
	public void classK() {
		System.out.println("Class K Testcase");
	}
	@Test(enabled=false)
	public void classE() {
		System.out.println("Class E Testcase");
	}
}
