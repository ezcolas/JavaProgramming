package sampleTest;

public class Exo3 {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3};

		System.out.println(sumEvenOdd(arr));
	}

	static int sumEvenOdd(int[] arr) {
		// Check if the array is null
		if (arr == null)
			return 0;

		int X = 0;
		int Y = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				Y = arr[i];
			else
				X = arr[i];

		}

		return X - Y;
	}
}
