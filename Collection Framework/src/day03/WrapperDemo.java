package day03;

public class WrapperDemo {

	public static void main(String[] args) {
		// Primitive way of representing 10
		int a = 10;
		// Non-Primitive way of representing 10
		Integer b = new Integer(10);
		
		System.out.println(a+" "+b);
		
		
		System.out.println("----------------");
		
		// Primitive way of representing 'A'
		char l = 'A';
		
		// Non-Primitive way of representing 'A'
		
		Character c = new Character('A');
		
		System.out.println(l+" "+c);
	}
	
}
