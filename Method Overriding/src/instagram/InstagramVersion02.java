package instagram;

public class InstagramVersion02 extends InstagramVersion01 {
	@Override
	void DM() {
		super.DM();
		System.out.println("it supported seding images through DM");
	}

	@Override
	void reels() {
		super.reels();
		System.out.println("supported 30 seconds clips");
	}
	void call() {
		System.out.println("supported voice call");
	}

}
