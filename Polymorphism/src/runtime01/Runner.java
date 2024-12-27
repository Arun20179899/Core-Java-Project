package runtime01;

public class Runner {

	public static void main(String[] args) {
		Employee e1 = new Developer();
		e1.work();
		Employee e2 = new Tester();
		e2.work();
		Employee e3 = new HR();
		e3.work();

		System.out.println("------------Make use of reference in different way------------");
		Employee emp;
		emp = new Developer();
		emp.work();
		emp = new Tester();
		emp.work();
		emp = new HR();
		emp.work();
	}

}