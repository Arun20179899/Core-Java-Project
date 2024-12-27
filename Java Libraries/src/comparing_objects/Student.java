package comparing_objects;

public class Student {

	int studentID;
	double age;

	public Student(int studentID, double age) {

		this.studentID = studentID;
		this.age = age;
	}
	// in order to compare the custom data of both objects we need to override the
	// equals method in such a way that

	public boolean equals(Object obj) { // internally Object obj = new Student(101, 5.4); --> Up casting
		Student s = (Student) obj; // here we have Down Casting
		return this.studentID == s.studentID && this.age == s.age;
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, 5.4);
		Student s2 = new Student(101, 5.4);
		Object result = s1.equals(s2); // why s1 is as current object - because s1 is getting compared to s2.
		System.out.println(result); // internally it will compare object or hash code of an object
		// value return always false only even though the both object have same value
	}

}
