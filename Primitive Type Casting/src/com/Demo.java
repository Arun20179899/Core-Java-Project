package com;

public class Demo {
	public static void main(String[] args) {
		System.out.println("-------------Widening------------"); // it is done implicitly
		// converting Smaller type of data into Bigger type of data

		System.out.println("byte \t int");

		byte a = 67; // a-->76
		int b = a; // b-->76
		System.out.println(a + "\t" + b);

		System.out.println("char \t int");

		char c = 'A'; // c-->A
		int d = c; // d--> 65 -->ASCII value - American Standard Code for Information Interchange
		System.out.println(c + "\t" + d);

		System.out.println("long \t double");

		long l = 4567;
		double p = l;
		System.out.println(l + "\t" + p);

		System.out.println("float \t double");

		float g = 3534.89f;
		double f = g;
		System.out.println(g + "\t" + f);

		System.out.println("-------------Narrowing------------"); // it is done explicitly
		// converting Bigger type of data into Smaller type of data

		System.out.println("double \t float");

		double db = 6785654.6867;
		float ft = (float) db; // done explicitly
		System.out.println(db + "\t" + ft);

		System.out.println("double \t int");
		double dl = 7464.786;
		int in = (int) dl;
		System.out.println(dl + "\t" + in);

		System.out.println("int \t char");
		int value = 90;
		char ch = (char) value;
		System.out.println(value + "\t" + ch);

		System.out.println("===============tricky interview Question====================");
		System.out.println("A" + "A");
		System.out.println('A' + 'A');// 65 + 65 --> 130
		System.out.println('a' + 10); // 97 + 10 --> 107
		System.out.println('a'+"A"); // aA

	}

}
