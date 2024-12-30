package day06;

import java.util.TreeSet;

public class LatopSort {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(34, "HP", 45678.67);
		Laptop l2 = new Laptop(56, "DELL", 34500.85);
		Laptop l3 = new Laptop(76, "LENOVA", 76854.78);

		TreeSet<Laptop> t = new TreeSet<Laptop>();

		t.add(l1);
		t.add(l2);
		t.add(l3);

		for (Laptop obj : t) {
			System.out.println(obj);
		}

	}

}
