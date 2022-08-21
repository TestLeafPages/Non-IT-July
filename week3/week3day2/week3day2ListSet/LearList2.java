package week3day2ListSet;

import java.util.ArrayList;
import java.util.List;

public class LearList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		numbers.add(6);
		
		int size = numbers.size();
		System.out.println("Size of the list " +size);
		int count=0;
		for(int i=0;i<size;i++) {
			//System.out.println(numbers.get(i));
			if(numbers.get(i)==3) {
				//arr[i]==arr[i+1]
				count++;
			}
			
			}
		System.out.println(count); 
		
		
		}
		
		
		
		
		
		
	

}
