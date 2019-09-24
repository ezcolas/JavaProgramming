package unit2;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		String[] names = { "Steeve", "Joe", "Alice", "Tom" };

		// Sort the array in place
		Arrays.parallelSort(names);

		System.out.println(Arrays.toString(names));
	}
}
