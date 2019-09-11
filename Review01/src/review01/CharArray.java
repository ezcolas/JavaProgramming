package review01;

public class CharArray {

	public static void main(String[] args) {

		char[] a = { 'a', 'b', 'c' };
		System.out.println(a3(a, 1, 2));
	}

	static char[] a3(char[] a, int start, int length) {
		// Check the table and start and length
		if (a == null || length < 0 || start < 0 || start + length - 1 >= a.length)
			return null;

		// create a new array
		char[] sub = new char[length];
		for (int i = start, j = 0; j < length; i++, j++) {
			sub[j] = a[i];
		}

		return sub;
	}
}
