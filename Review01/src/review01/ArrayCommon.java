package review01;

public class ArrayCommon {
	
	public static void main(String[]args) {
		int [] a = {1, 8, 3, 2};
		int [] b ={4, 2, 6, 1};
		
		a5(a, b);
	}

	static int[] a5(int[] first, int[] second) {

		// Check if the table is null
		if (first == null || second == null) {
			return null;
		}

		// Check if the size of one of the array is 0
		if (first.length == 0 || second.length == 0)
			return new int[0];

		// Select the min
		int min = first.length < second.length ? first.length : second.length;

		int[] a, b;

		if (min == first.length) {
			a = first;
			b = second;
		} else {
			b = first;
			a = second;
		}

		int[] c = new int[min];
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; i < a.length; i++) {
				if (a[i] == b[j]) {
					c[k] = a[i];
					k++;
				}
			}
		}

		int[] retArray = new int[k];

		for (int t = 0; t < retArray.length; t++) {
			retArray[t] = c[t];

		}

		return retArray;
	}
}
