package javaCollections.arrayList;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");

		// Displaying elements
		System.out.println(alist);

		// Adding steeve at the fourth position
		alist.add(3, "Steve");

		// Displaying elements
		System.out.println(alist);

		// Removing Steeve and Angela
		alist.remove("Steeve");
		alist.remove("Angela");

		// Displaying elements
		System.out.println(alist);

		// Removing the 3rd element
		alist.remove(2);

		// Displaying elements
		System.out.println(alist);
		
		//Iterating ArrayList
		for(String str: alist) {
			System.out.println(str);
		}
	}
}
