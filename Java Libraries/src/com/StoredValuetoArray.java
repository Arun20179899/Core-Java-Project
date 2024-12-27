package com;

public class StoredValuetoArray {

	String bankName;
	String accHolderName;
	double amountBalance;

	public StoredValuetoArray(String bankName, String accHolderName, double amountBalance) {
		this.bankName = bankName;
		this.accHolderName = accHolderName;
		this.amountBalance = amountBalance;
	}

	public String toString() {
		return this.bankName + " " + this.accHolderName + " " + this.amountBalance;
	}

	public static void main(String[] args) {
		StoredValuetoArray s1 = new StoredValuetoArray("Karnataka", "Karthik", 450000.90);
		StoredValuetoArray s2 = new StoredValuetoArray("SBI", "Arun", 56789.90);
		StoredValuetoArray s3 = new StoredValuetoArray("canera", "Sachin", 34567.56);

		StoredValuetoArray[] s = { s1, s2, s3 };

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		/*
		 * StoredValuetoArray[] s = new StoredValuetoArray[3]; // Array of type
		 * StoredValuetoArray s[0] = s1; s[1] = s2; s[2] = s3;
		 * 
		 * //without overriding toString() for (int i = 0; i < s.length; i++) {
		 * System.out.println(s[i]);
		 * System.out.println(s[i].bankName+" "+s[i].accHolderName+" "+s[i].
		 * amountBalance); }
		 */

	}

}
