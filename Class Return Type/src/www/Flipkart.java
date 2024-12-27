package www;

public class Flipkart {
Electronics Order(int choice){
	if (choice==1) {
		return new Laptop();
	}
	else if (choice == 2) {
		return new Mobile();
	}
	else if(choice == 3) {
		return new Watch();
	}
	else {
		return null;
	}
}
}
