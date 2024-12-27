package com;

public class Demo {
	public static void main(String[] args) {
		// Array Declaration
		int[] a;

		// Array creation
		a = new int[4];

		// printing array element
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

		System.out.println("====================");
		// Array initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

		// To find the size of the array -> arrayname.lenth - it will return integer
		// value
		System.out.println("-----------Size of an array------");
		int size = a.length;
		System.out.println(size);

		System.out.println("----------------");
		// Array declaration and creation
		double[] d = new double[3];
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);

		System.out.println("===============");
		d[0] = 45.45;
		d[1] = 56.78;
		d[2] = 34.45;
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);

		System.out.println("-----------Size of an array------");
		int size1 = d.length;
		System.out.println(size1);
		// array print statement optimization
		for (int i = 0; i < d.length; i++) {
			System.out.println(i + "\t" + d[i]);
		}

		// Array declaration and store the values directly in a single line [without
		// using new]
		String[] names = { "John", "Bruce", "Roy", "Scoat", "Stephan", "joshua" };
		// String[] names = new String[6]; -> if i use this and create a print statement
		// before initialization the prints default values of respective data type

		for (int i = 0; i < names.length; i++) {
			System.out.println(i + "\t" + names[i]);
		}
		System.out.println("====================");

		// copy the values from one array to another array
		int[] arr = { 12, 23, 24, 54, 67 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		// copy to another array
		int[] akk = arr;
		// reinitialize the value after copied
		akk[4] = 76;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(akk[i]);
		}

	}
}
