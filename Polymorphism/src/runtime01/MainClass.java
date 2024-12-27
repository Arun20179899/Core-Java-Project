package runtime01;

public class MainClass {

	void invokeWork(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {
		MainClass mc = new MainClass();
		mc.invokeWork(new Developer());
		mc.invokeWork(new Tester());
		mc.invokeWork(new HR());

		System.out.println("----");
		Developer d = new Developer();
		mc.invokeWork(d);
		Tester t = new Tester();
		mc.invokeWork(t);
		HR h = new HR();
		mc.invokeWork(h);
	}

}
