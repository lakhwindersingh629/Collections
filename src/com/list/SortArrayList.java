package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Sort cars in Ascending order

		System.out.println("printed add value " + cars);

		System.out.println("sorted in acending order ");

		Collections.sort(cars);
		for (String i : cars) {

			System.out.println(i);
		}

		/*
		 * This version of Collections.sort() accepts the ArrayList object as the first
		 * parameter and a Comparator object that theCollections.reverseOrder() method
		 * returns as the second parameter.
		 * 
		 */

		Collections.sort(cars, Collections.reverseOrder());
		System.out.println("sorted in decending order ");
		for (String i : cars) {
			System.out.println(i);
		}

	}

}
