package checkedANDunchecked;

public class Checked01 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
//InterruptedException - example of Checked Exception