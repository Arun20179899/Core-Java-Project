package instagram;

public class InstagramVersion03 extends InstagramVersion02 {
	@Override
	void DM() {
		super.DM();
		System.out.println("it supported all types of files");
	}

	@Override
	void reels() {
		super.reels();
		System.out.println("supported to share the reels to friends");
	}

	@Override
	void call() {
		super.call();
		System.out.println("supported vedio call");
	}

}
