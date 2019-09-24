package practice01;

public class Array121 {

	public static void main(String[] args) {
		int[] a = { 1,1,2,2, 2, 1,1, 1 };
		System.out.println(is121Array(a));
	}

	public static int is121Array(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		int i = 0;

		while (a[i] == 1 && i < a.length) {
			count1++;
			i++;
		}

		int j = i;

		while (a[j] == 2 && i < a.length) {
			count2++;
			j++;
		}

		int k = a.length -1;

		while (a[k] == 1) {
			count3++;
			k--;
		}

		if (count1 == count3 && count2 != 0)
			return 1;

		return 0;
	}
}
