package day03;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 50, 80, 15 };
		/* Normal For loop way we are fetching the data one by one */
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("------------------");

		for (int k : a) {
			System.out.println(k);
		}

		System.out.println("-----------------");

		String[] s = { "Java", "Phython", "C#", "Ruby" };
		for (String name : s) {
			System.out.println(name);
		}

		System.out.println("--------------");

		double[] d = { 19.45, 45.56, 56.56, 89.67 };
		for (double e : d) {
			System.out.println(e);
		}

	}

}
