package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsSort {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(110);
		al.add(100);
		al.add(120);
		al.add(130);
		al.add(150);
		System.out.println("Before Sort of ArrayList Object");
		System.out.println(al);
				
		System.out.println("After Sort of ArrayList Object");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("--------------------------------------");

		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(40);
		ll.add(70);
		ll.add(30);
		ll.add(20);

		System.out.println("Before Sort of LinkedList Object");
		System.out.println(ll);
		
		System.out.println("After Sort of LinkedList Object");
		Collections.sort(ll);
		System.out.println(ll);

	}

}
