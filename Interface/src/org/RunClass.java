package org;

public class RunClass extends Employee implements Jspider {

	public static void main(String[] args) {
		RunClass rc = new RunClass();
		rc.develop();
		rc.test();
		rc.work();
		Jspider.work();
		rc.work(23);

	}

}
