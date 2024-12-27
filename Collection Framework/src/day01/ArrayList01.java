package day01;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		/* add() it is used to add an object into the collection */
		l.add(10);
		l.add(20.45);
		l.add(10);
		l.add(null);
		l.add("Arun");
		l.add('A');
		
		System.out.println(l); // internally toString() method is overridden - l.toString(
		System.out.println("-------------------");
		/* size() is used to return the length of the collection */
		System.out.println(l.size());
		
		System.out.println("-------------------");
		/* get() is used to return an object based on the index position */
		System.out.println(l.get(4));
		
		System.out.println("-------------------");
		/* contains() is used to check if the object is present in the collection or not */
		System.out.println(l.contains("Arun"));
		System.out.println(l.contains("arun"));
		
		System.out.println("-------------------");
		
		System.out.println(l);
		/* remove() is used to remove an object from the collection based on the index */
		System.out.println(l.remove(2));
		
		System.out.println(l);
		
		System.out.println("-------------------");
		/* isEmpty() is used to check if the collection is empty or not */
		System.out.println(l.isEmpty());
		
		/* clear() is used to remove all the objects from the collection */
		l.clear();
		
		System.out.println(l.isEmpty());
		
		System.out.println("-------------------");
		
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		x.add(10);
		x.add(40);
		x.add(10);
		x.add(70);
		
		System.out.println(x);
		
		System.out.println("-------------------");
		/* indexof() is used to find the index position of an object and first occurrence in the case of duplicates */
		System.out.println(x.indexOf(70));
		
		System.out.println("-------------------");
		/* lastIndexof() is used to find the last index position of an object */
		System.out.println(x.lastIndexOf(10));
		

	}

}
