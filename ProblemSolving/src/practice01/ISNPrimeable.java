package practice01;

public class ISNPrimeable {

	public static void main(String[] args) {
		int[] a = {};
		System.out.println(isNPrimeable(a, 2));
	}

	public static int isNPrimeable(int[] a, int n) {

		if (a == null) {
			return 0;
		}

		for (int i = 0; i < a.length; i++) {
			a[i] += n;
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					return 0;
				}
			}
		}

		return 1;
	}
}
