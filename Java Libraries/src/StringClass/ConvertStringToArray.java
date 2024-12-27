package StringClass;

public class ConvertStringToArray {

	public static void main(String[] args) {

		String s = "Arun";
		char[] ch = s.toCharArray(); // ['A', 'r', 'u', 'n']
		for(int i = 0; i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		System.out.println("");
		for(int i = ch.length-1; i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
