package whatsapp;

public class WhatsApp3 extends WhatsApp2 {
	@Override
	void display() {
		super.display();
		System.out.println("blue ticks supported");
	}

	@Override
	void call() {
		super.call();
		System.out.println("vedio call supported");
	}
	//implemented in current class 
	void file() {
		System.out.println("image is supported as story");
	}

}
