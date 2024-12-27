package com;

public class Department extends College{
	@Override
	public void conductExam() {
		System.out.println("VTU is conducted exam");
	}
	@Override
	public void conductFest() {
		System.out.println("College organize fest");
	}

}
