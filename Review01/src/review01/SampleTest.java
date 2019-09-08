package review01;

public class SampleTest {

	public static void main(String[] args) {

		int[] a = {10};

		System.out.println(IsCentered(a));
	}

	static int IsCentered(int[] arr) {

		if (arr == null || arr.length % 2 == 0)
			return 0;

		// Determine the middle
		int mid = (arr.length) % 2;
		int middle = arr[mid];

		for (int i = 0; i < arr.length; i++) {
			if (i!= mid && arr[i] < middle)
				return 0;
		}

		return 1;
	}

	
	
}
