package day03;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>(); // constructor is an optional to defined --> ArrayList<String>()
		
		al.add("Phython");
		al.add("Java");
		al.add("C#");
		
		for(String programme : al) {
			System.out.println(programme);
		}
		
		System.out.println("-----------------");
		
		LinkedList<Integer> ll = new LinkedList();
		
		ll.add(345);
		ll.add(3467);
		ll.add(678);
		ll.add(899);
		
		for(Integer num : ll) { //for(int num : ll) --> We can use both primitive type as well non-primitive type
			System.out.println(num);
		}
		

	}

}
