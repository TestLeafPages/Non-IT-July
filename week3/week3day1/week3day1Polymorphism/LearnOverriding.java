package week3day1Polymorphism;

public class LearnOverriding extends LearnOverridingparent{

	public void MyHouse() {
		super.MyHouse();
		System.out.println("Child house");
		
	}
	
	public void familyName(String name) {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnOverriding overriding=new LearnOverriding();
		
		overriding.familyName("Singh");
		overriding.MyHouse();
		
	}

}
