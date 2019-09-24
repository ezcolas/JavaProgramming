package javaCollections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
	public static void main(String[] args) {

		// Array Declaration and initialization
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

		// Array to ArrayList conversion
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));

		// Adding new element to the converted list
		citylist.add("New City2");
		citylist.add("New City3");

		// Final Arraylist content display using for *
		for (String str : citylist) {
			System.out.println(str);
		}

	}
}
