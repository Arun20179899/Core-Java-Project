package day05;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(123);
		ts.add(56);
		ts.add(98);
		ts.add(23);
		ts.add(56);
		ts.add(90);
		ts.add(45);
		ts.add(34);
		ts.add(56);
		ts.add(23);
		System.out.println(ts);
		
		TreeSet<String> fruits = new TreeSet<String>();
		
		fruits.add("Lemon");
		fruits.add("Guva");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("ButterFruite");
		fruits.add("lime");
		fruits.add("Pomogranate");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Sapaota");
		fruits.add("Tamoto");
		fruits.add("Chikku");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		for(String fruit : fruits) {
			
		}
		

	}

}
