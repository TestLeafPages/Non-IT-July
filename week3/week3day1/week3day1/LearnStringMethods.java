package week3day1;

import java.util.Iterator;

public class LearnStringMethods {

	public static void main(String[] args) {
		String word = "Testleaf# 12";
		// length of String
		int length = word.length();
		System.out.println(length);
		
		// to convert String into character array
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		// To find the particular character based on index
		char charAtIndex = word.charAt(2);
		System.out.println("To find the particular character based on index " + charAtIndex);

		// to convert the String to uppercase
		String upperCase = word.toUpperCase();
		System.out.println(upperCase);

		// to convert the String to lowercase
		String lowerCase = word.toLowerCase();
		System.out.println(lowerCase);

	}

}
