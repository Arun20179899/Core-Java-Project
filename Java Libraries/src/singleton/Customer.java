package singleton;

public class Customer {

	public static void main(String[] args) {
		SBIBank result = SBIBank.createSBIObject();
		System.out.println(result.toString());

	}

}
// SBIBank.createSBIObject(); =--> new SBIBank();
// SBIBank result = new SBIBank();