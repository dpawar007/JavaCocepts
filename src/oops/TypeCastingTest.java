package oops;

class Type{
	void m1() {
		System.out.println("Type m1()");
	}
}
public class TypeCastingTest extends Type {

	void m1() {
		System.out.println("TypeCastingTest m1()");
	}
	void m2() {
		System.out.println("TypeCastingTest m2()");
	}
	public static void main(String[] args) {
		
		Type t =new TypeCastingTest();
		t.m1();
		Type t1 =new Type();
		t1.m1();
      //t.m2();  In java parent class reference variable is able to hold Child class object but Child class reference variable unable to hold Parent class object
		TypeCastingTest T =(TypeCastingTest)t; //type casting parent reference variable to child object.
		T.m1();
		T.m2();
	}
}
