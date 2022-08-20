package week3day1Inheritance;

public class ExecutionClass extends Pet{
	
	public void learningInheritance() {
		System.out.println("Types of Inheritance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutionClass call=new ExecutionClass();
		call.barking();
		call.chasing();
		call.eating();
		call.lovableFeature();
		call.providesSecurity();
		String colour2 = call.colour;
		System.out.println(colour2);
		
	}

}
