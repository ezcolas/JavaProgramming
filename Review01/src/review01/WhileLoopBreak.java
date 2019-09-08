package review01;

import java.util.Scanner;

public class WhileLoopBreak {

	public static void main(String[] args) {
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a positive Number to sum:");
			int value = sc.nextInt();

			if (value <= 0) {
				break;
			}

			sum = sum + value;
		}

		System.out.println("The sum is " + sum);
	}
}
