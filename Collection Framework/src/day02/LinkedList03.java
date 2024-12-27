package day02;

import java.util.*;

public class LinkedList03 {

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

		System.out.println("------------------");
		/*
		 * add(index, object) it is used add the object into the collection and already
		 * existing object shifted to the next position
		 */
		ll.add(2, 60);
		System.out.println(ll);

		System.out.println("-----------------------");

		System.out.println(al);
		/*
		 * set(index, object) - it is used add the object into the collection and
		 * existing object gets overridden
		 */
		al.set(1, 101);

		System.out.println(al);

	}

}
