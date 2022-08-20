package week3day1;



public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="Testleaf# 12";
		String rev="";
		//length of String
		System.out.println(rev);
		int length = word.length();
		System.out.println(length);
		
		//to convert String into character array
		char[] charArray = word.toCharArray();
		for(int j=charArray.length-1;j>=0;j--) {
			rev=rev+charArray[j];
		}
	    System.out.println("Original String is "+word);
		System.out.println("Reversed String:" +rev);
		
		
		
	
		
		 
		
		 
		 
		 
		
		
	}

}
