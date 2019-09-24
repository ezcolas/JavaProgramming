package practice01;

public class Anagram {

	public static void main(String[] args) {

		char[] a = {'b','o','g'};
		char[] b = {'b','o','o'};

		System.out.println(anagram(a, b, 2));
	}

	public static int anagram(char[] a, char[] b, int len) {
		if (a == null || b == null || a.length != b.length) {
			return 0;
		}

		int counter1 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == b[i])
				counter1++;
		}

		if (counter1 == len) {
			return 1;
		}

		int counter2 = 0;
		for (int j = 0; j < len; j++) {
			int k = 0;
			do {
				if (a[j] == b[k]) {

					counter2+=1;
					break;
				}
				k++;
			} while (k <= len);
		}

		if (counter2 == len)
			return 1;

		return 0;
	}
}
