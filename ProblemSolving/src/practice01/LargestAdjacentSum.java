package practice01;

public class LargestAdjacentSum {

	public static void main(String []args) {
		
		int [] a = {1,1,1,1,1,2,1,1,1};
		
		System.out.println(largestAdjacentSum(a));
	}
	
	public static int largestAdjacentSum(int[] arr) {

		if (arr.length < 2) {
			return -1;
		}

		int sum = arr[0] + arr[1];

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] + arr[i + 1] > sum)
				sum = arr[i] + arr[i + 1];
		}
		return sum;
	}
}
