package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	datatype[] variableName={input values separated by commas}
		
	//declare the array->literal	
	int[] number= {1,2,3,4,5,6,7};	
	int length = number.length;
	
	System.out.println("Size of number array" +length);
	//String name="vidya";
	String[] fruits= {"Apple","Orange","Pine","guva"};
	int fruitCount = fruits.length;
	
	float[] per= {2.5f,3.8f,4.9f};
	System.out.println("Size of per array " +per.length);
	
	char alphabet='f';
	char[] letters= {'c','b'};
	int alpa = letters.length;
	
	System.out.println("Size of Friuts array" +fruitCount);
	System.out.println("Size of letters array " +alpa);
	
	//declare array->new keyword
	
	int[] num= new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	
	System.out.println(number[3]);
	System.out.println(num[3]);
	
	int[] n= {2,5,3,3,4,7,8};
	
	Arrays.sort(n);//sort out in acsending order
	System.out.println(n);// prints the address the created array
	int nLength = n.length;
	int nums=5;
	for(int j=0;j<=nLength-1;j++)
	{
		if(n[j]==nums) {
			System.out.println("Number is available");
		
	}	
	for(int i=nLength-1;i>0;i--) {
		 
		System.out.println(n[i]);
		}
		
		//n[0]
		//n[1]
		//n[2]
	}

	
	
	System.out.println(Arrays.toString(n));
	
	
	
	
		
	}

}
