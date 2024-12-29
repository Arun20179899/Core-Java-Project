package day04;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student("Jerry", 23);
		Student s2 = new Student("tom", 25);
		Student s3 = new Student("teddy", 27);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student value : al) {
			
			System.out.println(al.toString());
			/*below is using without overridden the toString() */
			//System.out.println("Name: "+value.name+"\nAge: "+value.age);
		}

	}

}
