package review01;

public class Reverse {
	
	public static void main(String [] args) {
		System.out.print(reverse(90));
	}

	static int reverse(int n) {
		//if (n / 10 == 0)
			//return n;
		int inverse = 0;
		while (n != 0) {
			inverse = (inverse * 10) + (n % 10);
			n = n / 10;
		}
		return inverse;
	}
}
