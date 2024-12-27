package StringClass;

public class MethodsINStringClass {

	public static void main(String[] args) {
		
		String stdName = new String("Arun Kumar A S");
		
		System.out.println("--------------------------");
		
		System.out.println(stdName.length());
		
		System.out.println("--------------------------");
		
		System.out.println(stdName.toUpperCase());
		
		System.out.println("--------------------------");
		
		System.out.println(stdName.toLowerCase());
		
		System.out.println("--------------------------");
		
		System.out.println(stdName.charAt(5));
		
		System.out.println("--------------------------");
		
		System.out.println(stdName.indexOf('K'));
		
		System.out.println("--------------------------");
		//Arun Kumar A S
		System.out.println(stdName.concat(" "+stdName));
		
		System.out.println("--------------------------");
//		stdName = stdName.toUpperCase();
		System.out.println(stdName.startsWith("ARU"));
		System.out.println(stdName.startsWith("Aru"));
		
		System.out.println("--------------------------");
		
		System.out.println(stdName.endsWith(" A A"));
		System.out.println(stdName.endsWith(" A S"));
		
		System.out.println("--------------------------");
		
		System.out.println(stdName.contains("Arun"));
		System.out.println(stdName.contains("arun"));
		
		System.out.println("--------------------------");
		String s1 = "Arun";
		String s2 = "arun";
		String s3 = "Arun";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("--------------------------");
		
		String name = "Hi Ammu";
		
		System.out.println(name.substring(4)); // consider string name from index of 4 
		System.out.println(name.substring(3,6)); // consider string name in between index of 3 and 6 but 1 character less from the last digit 
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");

	}

}
