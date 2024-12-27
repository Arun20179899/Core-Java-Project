package org.PublicDemo;

import com.PublicDemo.Demo;
import com.PublicDemo.Test;

public class Sample {
	public static void main(String[] args) {
		Demo d = new Demo(); // access Demo Class
		System.out.println(d.a);
		d.display();
		Test t = new Test(); // Access Test Class
		t.get();

	}
}
