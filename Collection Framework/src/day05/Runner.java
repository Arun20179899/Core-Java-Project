package day05;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Runner {

	public static void main(String[] args) {
		 
		HashSet h = new HashSet();
		h.add(123);
		h.add("Java");
		h.add(123);
		h.add(34);
		h.add(50);
		h.add("java");
		System.out.println(h);
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(123);
		ls.add("Java");
		ls.add(123);
		ls.add(34);
		ls.add(50);
		ls.add("java");
		
		System.out.println(ls);

	}

}
