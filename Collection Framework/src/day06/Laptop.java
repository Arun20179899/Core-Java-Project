package day06;

public class Laptop implements Comparable<Laptop> {
	int laptopId;
	String laptopName;
	double laptopPrice;

	Laptop(int laptopId, String laptopName, double laptopPrice) {
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() {
		return "Laptop [ id: " + this.laptopId + "\t Name: " + this.laptopName + " \t Price: " + this.laptopPrice
				+ " ] ";
	}

	/*
	 * //Business logic for integer value
	 * 
	 * @Override public int compareTo(Laptop obj) { return this.laptopId -
	 * obj.laptopId; // --> this is for ascending order }
	 */
	/*
	 * // Business logic for String value public int compareTo(Laptop obj) { return
	 * this.laptopName.compareTo(obj.laptopName); // this is for ascending order
	 * obj.laptopName.compareTo(this.laptopName);
	 * 
	 * }
	 */
	// Business logic for double value
	public int compareTo(Laptop obj) { // up casting only compare non - decimal value
		return (int) (this.laptopPrice - obj.laptopPrice); // this is for ascending order
//		return (int) (obj.laptopPrice - this.laptopPrice); // this is for decending order
//		Double d = new Double(obj);
//		return this.laptopPrice - d.doubleValue();
	}

}
