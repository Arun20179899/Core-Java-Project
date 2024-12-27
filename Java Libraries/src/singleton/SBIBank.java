package singleton;

public class SBIBank {
	String accNumber = "596974948939739950";
	String accHolderName = "Arun Kumar A S";
	double accBalance = 846568.89;

	private static SBIBank sb1;

	private SBIBank() {
		System.out.println("Account got Created");
	}

	@Override
	public String toString() {
		return "Account Name: " + accHolderName + "\nAccount Number: " + accNumber + "\nAccount Balance: " + accBalance;
	}

	public static SBIBank createSBIObject() {
		if (sb1 == null) {
			sb1 = new SBIBank();
		} else {
			System.out.println("we cannot create a obj");
		}
		return sb1;

	}
}
