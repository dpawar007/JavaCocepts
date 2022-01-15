package oops;

import java.util.Scanner;

class A{  //parent class or super class or base
	void m1() {System.out.println("m1");}
	void m2() {System.out.println("m2");}
}
class B extends A{ //child or sub or derived
	void m3() {System.out.println("m3");}
	void m4() {System.out.println("m4");}
}
class C extends B{
	void m5() {System.out.println("m5");}
	void m6() {System.out.println("m6");}
}

//single Inherit
class SingleParent {
    void property() {System.out.println("Parent Property");}	
    
    
}

 
class SingleChild extends SingleParent{
	void money() {
		System.out.println(" Money");
	}
}


public class InheritanceTest {

	public static void main(String[] args) {
	/*//1. If we are creating object for parent class it is possible to call only parent specific methods.
		A a=new A();
		a.m1();a.m2(); 
		
		System.out.println();
    //2.if we are creating object for child class it is possible to call parent specific and child specific.
		B b=new B();
		b.m1();b.m2(); b.m3();b.m4();
		System.out.println();
		C c=new C();
		c.m1(); c.m2(); c.m3();c.m4();c.m5();c.m6();*/
		
		
		SingleChild c= new SingleChild();
		c.property(); //parent class method executed
		c.money(); //child class method executed
		Scanner obj = new Scanner(System.in);
		 
		SingleParent s = new SingleParent();
		
		System.out.println("Object Class Method getClass() :- "+c.getClass());
		System.out.println("Object Class Method toString() :- "+c.toString());
		System.out.println("Object Class Method hashCode() :- "+c.hashCode());
		
		System.out.println(c instanceof SingleChild);
		System.out.println(c instanceof SingleParent); //Child - Parent
		System.out.println(s instanceof SingleChild);  //Parent - Child
		
	}

}
