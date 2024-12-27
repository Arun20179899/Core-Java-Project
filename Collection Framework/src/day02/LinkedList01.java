package day02;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(40);
		al.add(70);
		al.add(30);
		al.add(20);
		
		System.out.println(al);
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(40);
		ll.add(70);
		ll.add(30);
		ll.add(20);
		System.out.println(ll);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("-----------------");
		
		for (int i = ll.size()-1; i >=0; i--) {
			System.out.println(ll.get(i));
		}

	}

}
