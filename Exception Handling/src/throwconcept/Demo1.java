package throwconcept;

public class Demo1 {

	static void div() throws Exception { // information told to the caller so caller should inside with try and catch
		System.out.println(10/0);
	}

	public static void main(String[] args) {

		System.out.println("start");

		try {
			div();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		System.out.println("end");


	}

}
