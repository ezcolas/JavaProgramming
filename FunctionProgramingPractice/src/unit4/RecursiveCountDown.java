package unit4;

public class RecursiveCountDown {

	// Simple countDown using recursion
	public static void main(String[] args) {
		countDown(6);
	}

	public static void countDown(int num) {
		if (num <= 0) {
			System.out.println();
		} else {
			System.out.println(num);
			countDown(num - 1);
		}
	}
}
