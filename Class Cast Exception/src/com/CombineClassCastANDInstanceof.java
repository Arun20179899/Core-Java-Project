package com;

public class CombineClassCastANDInstanceof {

	public static void main(String[] args) {
		Father f = new Daughter();
		// we have avoid the CCE through "instance of" operator
		if (f instanceof Son) {
			System.out.println("Downcasting to Son");
			Son s = (Son) f;
			System.out.println(s.x);
			System.out.println(s.y);
		}

		else if (f instanceof Daughter) {
			System.out.println("Downcasting to Daughter");
			Daughter d = (Daughter) f;
			System.out.println(d.x);
			System.out.println(d.z);

		}

	}

}
