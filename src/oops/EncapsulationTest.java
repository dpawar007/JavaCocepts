package oops;

class Encapsulation {
	private int sid;
	private String sname;

	// mutator methods
	public void setSid(int sid) {
 		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	// Accessor methods
	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}
}
public class EncapsulationTest {
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setSid(100);
		e.setSname("ratan");
		System.out.println(e.getSid());
		System.out.println(e.getSname());
	}
}
