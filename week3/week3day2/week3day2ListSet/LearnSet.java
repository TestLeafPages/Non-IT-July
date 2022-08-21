package week3day2ListSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		  
		  Set<Integer> values=new HashSet<Integer>();
		  
		  values.add(4); 
		  values.add(5); 
		  values.add(4);
		  
		  System.out.println(values);
		 

		List<String> listNames = new ArrayList<String>();
		listNames.add("Anu");
		listNames.add("Vijay");
		listNames.add("Raghu");
		listNames.add("santi");
		listNames.add("santi");
		int count = 0;
		for (int i = 0; i < listNames.size(); i++) {
			// System.out.println(numbers.get(i));
			if (listNames.get(i).contains("santi")) {
				count++;
			}
		}
		System.out.println(count);
		Set<String> names = new LinkedHashSet<String>();
		Set<String> dupnames = new LinkedHashSet<String>();

		for (String string : listNames) {
			if (!names.add(string)) {
				dupnames.add(string);
			}
		}
		System.out.println(names);
		System.out.println(dupnames);

		/*
		 * Set<String> names = new LinkedHashSet<String>(listNames);
		 * 
		 * System.out.println(names);
		 * 
		 * for (String string : names) {
		 * 
		 * System.out.println(string); }
		 */
	}

	// <>-->generic-->what type of datas in the list

	/*
	 * Integer-->int datas String-->charsequence Float-->float Double-->double
	 * Long-long Character-->char
	 */
}
