package oops;

class OverLoadMethods{
	
	public OverLoadMethods() {
		System.out.println("o arg Cons");
	}

	public OverLoadMethods(String fname) {
		System.out.println("1 arg Cons");
	}

	public OverLoadMethods(String fname, String lname) {
		System.out.println("2 arg Cons");
	}

	
	
	int add(int a, int b) {
		return a+b; 
	}
	
	int add(int a, int b, int c) {
		return a+b+c; 
	}
	String name(String n) {
		return n;
	}
	
	String name(String n,String m) {
		return n+m;
	}
}
public class MethodOveloadingTest {

	public static void main(String[] args) {
 
		OverLoadMethods o = new OverLoadMethods();
		System.out.println(o.add(10, 20));
		System.out.println(o.add(10, 20, 30));
		System.out.println(o.name("dipak"));
		System.out.println(o.name("dipak"," pawar"));

		new OverLoadMethods("Dipak");
		new OverLoadMethods("Dipak", "Pawar");

	}

}
