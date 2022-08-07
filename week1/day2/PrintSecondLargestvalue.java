package week1.day2;

import java.util.Arrays;

public class PrintSecondLargestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {2,5,3,3,4,7,8};
		int length = n.length;
		System.out.println(length-1);
		
		Arrays.sort(n);
		System.out.println(n[length-3]);
		
		
		
	}

}
