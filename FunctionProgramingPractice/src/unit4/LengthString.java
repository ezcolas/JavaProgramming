package unit4;

public class LengthString {
	
	public static void main(String[] args) {
		System.out.print(length("Colas"));
	}

	public static int length(String str) {
		// Base case
		if (str == null || str.equals(""))
			return 0;
		else
			return 1 + length(str.substring(1));
	}
}
