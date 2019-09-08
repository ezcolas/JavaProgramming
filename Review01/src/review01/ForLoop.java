package review01;

public class ForLoop {

	public static void main(String[] args) {
		/*for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i and j:" + i + " " + j);
		}*/
		int n = 6;

		// Nested for loop
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
}
