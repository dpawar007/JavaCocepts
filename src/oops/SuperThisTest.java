package oops;


class Parent{
	int a=100;
	int b=200;
}
public class SuperThisTest extends Parent {

	int a=10;
	int b=10;
	
	void dipslay(int x, int y) {
		int v=1,sum=1;
		System.out.println(v+sum);
		System.out.println("Local Variabls : "+x+y);
		System.out.println("Instantce Current Variabls : "+this.a+this.b);
		System.out.println("Parent Super Class variables : "+super.a+super.b);
	}
	public static void main(String[] args) {
		SuperThisTest s = new SuperThisTest();
		s.dipslay(10, 20);
	}

}
