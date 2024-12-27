package MultiLevel;

public class Student {

	public static void main(String[] args) {
		Department d = new Department();
		System.out.println(d.UnivercityName);
		System.out.println(d.CollegeName);
		System.out.println(d.DepartName);
		System.out.println("-----------------------");
		d.conductexams();
		d.placement();
		d.fest();

	}

}
