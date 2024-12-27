package day02;

import java.util.*;

public class LinkedList02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(110);
		al.add(100);
		al.add(120);
		al.add(130);
		al.add(150);

		System.out.println(al);

		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(40);
		ll.add(70);
		ll.add(30);
		ll.add(20);
		System.out.println(ll);
		/*
		 * addAll() is used to add all the objects from the one collection into another
		 * class
		 */
		ll.addAll(al);
		System.out.println(ll);
		System.out.println("------------");
		/*
		 * containsAll() it is used to check if all the objects of one collection is
		 * present inside another collection or not
		 */
		System.out.println(ll.containsAll(al));

		ll.remove(6);
		System.out.println(ll.containsAll(al));

		System.out.println("Before Remove");
		System.out.println(ll);

		/* removeAll() it is used to remove all the objects of one collection from another collection */
		ll.removeAll(al);

		System.out.println("After Remove");

		System.out.println(ll);

	}

}
