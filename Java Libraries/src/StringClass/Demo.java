package StringClass;

public class Demo {
	public static void main(String[] args) {
		String s = new String("a");
		System.out.println(s);
		System.out.println(s.toString());
		
		System.out.println("------------");
		
		System.out.println(s.hashCode());
		
		System.out.println("-----------");
		
		String s1 = new String("Love");
		String s2 = new String("Love");
		System.out.println(s1.equals(s2));
	}
}
