package week3day2ListSet;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		List<Integer> listValues = new ArrayList<Integer>();
		// to add datas into the list
		listValues.add(10);
		listValues.add(11);
		listValues.add(12);
		listValues.add(13);
		listValues.add(14);

		System.out.println(listValues);

		int size = listValues.size();
		System.out.println(size);

		// get the values from the list
		Integer integer = listValues.get(0);
		System.out.println(integer);
		// add values to the particular index
		listValues.add(0, 15);
		System.out.println(listValues);

		// remove the data from the particular index
		listValues.remove(3);
		System.out.println(listValues);

		/*
		 * //clear all values in the list listValues.clear();
		 * System.out.println(listValues);
		 */
		boolean contains = listValues.contains(13);
		System.out.println(contains);

	}

	// <>-->generic-->what type of datas in the list

	/*
	 * Integer-->int datas String-->charsequence Float-->float Double-->double
	 * Long-long Character-->char
	 */
}
