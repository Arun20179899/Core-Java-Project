package checkedANDunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked02 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("Demo.txt");
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
		}

	}

}
//FileNotFoundException - Checked Exception 