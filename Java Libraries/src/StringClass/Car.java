package StringClass;

public class Car {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c);
		System.out.println(c.toString());
		
		System.out.println("----------");
		
		System.out.println(c.hashCode());
		
		System.out.println("----------------");
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1.equals(c2));
		

	}

}
