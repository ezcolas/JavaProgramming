package unit4;

public class CharsReverse {

	public static void main(String[] args) {
		printCharsReverse("Colas");
	}
	
	public static void printCharsReverse(String str) {
		if(str == null ||  str.equals(""))
			return;
		else
		{
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}
}
