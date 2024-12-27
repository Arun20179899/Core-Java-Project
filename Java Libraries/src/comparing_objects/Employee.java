package comparing_objects;

public class Employee {
	int empID;
	double empSalary;

	public Employee(int empID, double empSalary) {
		this.empID = empID;
		this.empSalary = empSalary;
	}
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.empID == e.empID && this.empSalary == e.empSalary;
	}
	
	public String toString() {
		return this.empID+" "+this.empSalary;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, 340000);
		Employee e2 = new Employee(102, 340000);

		System.out.println(e1.equals(e2));

		System.out.println("-------------------------");

		System.out.println(new Employee(101, 40000).equals(new Employee(101, 40000)));

		System.out.println("--------------------");

		if (e1.equals(e2)) {
			System.out.println("Value are same \n"+e1+"\t\t"+e2);
		} else {
			System.out.println("values are different \n"+e1+"\t\t"+e2);
		}
	}

}
