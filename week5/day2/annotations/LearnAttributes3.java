package annotations;

import org.testng.annotations.Test;

public class LearnAttributes3 {

	@Test(dependsOnMethods = "annotations.LearnAttributes3.login",alwaysRun=true)
	public void createLead() throws InterruptedException {
		System.out.println("Created the lead");
	}

	@Test(dependsOnMethods = { "login", "createLead" })
	public void deleteLead() {
		System.out.println("Deleted the Lead");
	}
//packagename.classname.methodname
	@Test(dependsOnMethods="annotations.LearnAnnotation.Test2")
	public void editLead()  {
		System.out.println("Updated the Lead");
	
	}

	@Test
	public void mergeLead()  {
		System.out.println("Leads are merged");
	
	}

	@Test(timeOut=500)
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Logged in successfully");
		
	}

}
