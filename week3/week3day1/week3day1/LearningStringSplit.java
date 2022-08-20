package week3day1;

public class LearningStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //split based on delimiter-->
		String word = "I am learning Java in Testleaf";
		String[] split = word.split(" ");
		for (int i = split.length-1; i>=0; i--) {
			System.out.println(split[i]);			
		}
		
		
		
		
		
		/*
		 * String s="Vidya12 "; //to print particular seq of character from the given
		 * String String substring = s.substring(2); System.out.println(substring);
		 * String substring2 = s.substring(4,7); System.out.println(substring2);
		 * System.out.println(s.replace("d", "#"));
		 */
		
		
	}

}
