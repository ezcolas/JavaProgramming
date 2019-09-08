package strings;

public class CharAtExample {

	public static void main(String[] args) {
		String name = "javatpoint";

		// Return the char value at the 4th index
		char ch = name.charAt(4);
		System.out.println(ch);
		// Return the length of the word
		System.out.println(name.length());
		
		//Implementation of Java Contains() method
		String names = "what do you know about me";
		System.out.println(names.contains("do you know"));
		System.out.println(names.contains("about"));
		System.out.println(names.contains("hello"));
		
		//Implementation of endsWith
		System.out.println(names.endsWith("e"));
	}
}
