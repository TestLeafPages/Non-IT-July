package week3day1;

public class LearningComparision {
	public static void main(String[] args) {
		String word = "Testleaf# 12";
		String word2 = "Testleaf# 12";
		// str object comparision
		String str = new String("Testleaf");
		String str1 = new String("Testleaf");
		System.out.println("String with new keyword comparision using Operator:" + (str == str1));
		System.out.println("String with Equals method for string object " + str.equals(str1));

		// literal comparision
		System.out.println(word == word2);
		boolean strequals = word.equals(word2);
		System.out.println(strequals);

		if (word.equals(word2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		if (word.equalsIgnoreCase(word2)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}

	}

}
