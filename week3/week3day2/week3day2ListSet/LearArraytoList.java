package week3day2ListSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"apple","orange","Pine","Guva"};
			
		List<String> names=new ArrayList<String>();
		for(int i=0;i<s.length;i++) {
			names.add(s[i]);
		}
		System.out.println(names);
		
		
		List<String> fruits = Arrays.asList(s);
		System.out.println(fruits);
		
		//Collections-->collection interface
		Collections.sort(fruits);
		System.out.println(fruits);
			

		
		
		
		
	}

}
