package week1.day2;

public class Learnif {

	public static void main(String[] args) {
		
		int age=18;
		//Voting in the country-->age >=18
		
		if(age>=18) {//satified
			System.out.println("Rights to vote");
			
		}else {//not satified
			System.out.println("No Rights to Vote");
		}
		

		System.out.println("________________________________________");
		
		if(age<=18) {//18!=18
			System.out.println("Rights to Vote");
		}else if(age<18) {
			System.out.println("No Rights to vote");
		}else {
			System.out.println("Rights to vote");
		}
		
	
	}

}
