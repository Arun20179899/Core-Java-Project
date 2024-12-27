package throwconcept;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo03 {
	void readData() throws FileNotFoundException { // if we have do not know the name exception than use super class --> Exception
		FileReader file =  new FileReader("Demo.txt");
		
	}
	public static void main(String[] args) {
		Demo03 d = new Demo03();
		try {
			d.readData();
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
		}

	}

}
