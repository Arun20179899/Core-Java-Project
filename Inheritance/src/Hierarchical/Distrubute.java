package Hierarchical;

public class Distrubute {

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.Fname);
		System.out.println(s.Sname);
		s.wealth();
		s.sonwealth();
		Daughter d = new Daughter();
		System.out.println(d.Fname);
		System.out.println(d.Dname);
		d.wealth();
		d.daughterwealth();
		

	}

}
