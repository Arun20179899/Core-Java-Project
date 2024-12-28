package day03;

import java.util.ArrayList;

public class ObjectClassDemo {

	public static void main(String[] args) {
		int a = 10;
		double b = 12.45;
		char c = 'A';

		ArrayList al = new ArrayList();

		al.add(a); // internally it is converted to al.add(new Integer(a)) --> al.add(new
		// Integer(10));
		al.add(b); // internally it is converted to al.add(new Double(b)) --> al.add(new
		// Double(12.45));
		al.add(c); // internally it is converted to al.add(new Character(c)) --> al.add(new
		// Character('A'));
		al.add("Arun"); // internally it is converted --> al.add(new String("Arun"));

		for (Object obj : al) { // we will fetch all different object through object class -- it is a super most
			// class for all the classes and we will use upcasting 
			System.out.println(obj);

		}
	}

}
