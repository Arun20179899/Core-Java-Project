package day03;

public class AutoBoxing {

	public static void main(String[] args) {
		// below is the demo of AutoBoxing
		int i = 5;
		Integer l = new Integer(i);
		System.out.println(i + " " + l);

		System.out.println("----------------");
		char p = 'z';
		Character ch = new Character(p);
		System.out.println(p + " " + ch);

		System.out.println("----------");

		// below is the demo of Auto-unBoxing

		Double d = new Double(34.56);
		double m = d;
		System.out.println(d + " " + m);

		Boolean bn = new Boolean(true);
		boolean k = bn;
		System.out.println(bn + " " + k);

	}

}
