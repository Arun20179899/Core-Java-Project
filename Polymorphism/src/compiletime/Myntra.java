package compiletime;

public class Myntra {

	void purchase(int productId) {
		System.out.println(productId);

	}

	void purchase(String productName) {
		System.out.println(productName);
	}

	void purchase(int productCost, String productName) {
		System.out.println(productCost + "\t" + productName);
	}

	void purchase(String productName, int productCost) {
		System.out.println(productName + "\t" + productCost);
	}
}
