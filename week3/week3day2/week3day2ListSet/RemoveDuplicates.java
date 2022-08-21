package week3day2ListSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
