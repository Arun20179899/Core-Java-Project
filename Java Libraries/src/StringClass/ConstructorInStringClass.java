package StringClass;

public class ConstructorInStringClass {

	public static void main(String[] args) {

		// 1. Empty Representation of a String Class
		String s = new String();
		System.out.println(s);

		// 2. Passing set of Characters
		String stdName = new String("Arun Kumar A S");
		System.out.println(stdName);

		char[] a = { 'a', 'b', 'c', 'd' };

		// Convert char[] into a String Object
		String convertChar = new String(a);
		System.out.println(convertChar); // "abcd"
	}

}
