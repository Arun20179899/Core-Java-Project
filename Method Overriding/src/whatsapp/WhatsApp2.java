package whatsapp;

public class WhatsApp2 extends WhatsApp1 {
	@Override
	void display() {
		super.display();
		System.out.println("double ticks supported");
	}

	void call() {
		System.out.println("voice call supported");
	}

}
