package annotations;

import org.testng.annotations.Test;

public class LearnAttributes2 {

	@Test(invocationCount=3,invocationTimeOut=1000)
	public void createLead() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("Created the lead");		
	}
	
	@Test
	public void deleteLead() {
		System.out.println("Deleted the Lead");
	}
	
	@Test
	public void editLead() {
		System.out.println("Updated the Lead");
	}
	@Test
	public void mergeLead() {
		System.out.println("Leads are merged");
		
	}
	
	@Test
	public void login() {
		System.out.println("Logged in successfully");
		
	}
	
	
	
	
	
}
