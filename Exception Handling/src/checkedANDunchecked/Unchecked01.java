package checkedANDunchecked;

public class Unchecked01 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(RuntimeException e) {
			System.out.println("invalid denominator");
		}

	}

}
//ArithmeticException - unchecked exception - compiler unknown 