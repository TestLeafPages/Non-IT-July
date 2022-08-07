package week1.day2;

public class LearnForLoopwithIf {

	public static void main(String[] args) {

		
		//int i=8
				//if(i%2==0)
		
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				System.out.println("Drink water");
			} else {
				System.out.println("Completed round " + i);
			}
		}
		System.out.println("******************************");
		for (int i = 0; i <= 10; i++) {
			if (i == 8) {
				System.out.println("feel to faint");
				break;
			} else {
				System.out.println("Completed round " + i);
			}
		}
		System.out.println("******************************");
		for (int i = 0; i <= 10; i++) {
			if (i == 4) {
				continue;
			} else {
				System.out.println("Completed round " + i);
			}
		}

	}
}
