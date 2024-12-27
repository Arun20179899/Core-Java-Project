package familiy;

public class Son extends Father{
	@Override // it indicates this override from another class
	void bike() {
		System.out.println("Modified son's bike");
		super.bike();// implements super class father implementation by using super keyword
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.bike();
	}

}
