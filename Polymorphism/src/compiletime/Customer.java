package compiletime;

public class Customer {

	public static void main(String[] args) {
		Myntra m = new Myntra();
		m.purchase(67);
		m.purchase("Mobile");
		m.purchase(5000, "Watch");
		m.purchase("Bat", 4000);

	}

}
