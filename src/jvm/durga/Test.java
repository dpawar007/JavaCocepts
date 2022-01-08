package durga.jvmclsinfo;

import java.lang.reflect.*;
 
class Student {
	private String name;
	private int rollNo;

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		 
		Student s = new Student();
		Student s1 = new Student();
		Class c = s.getClass();
		Class c1 = s1.getClass();
		System.out.println("s  : "+c.getClass());
		System.out.println("s1 : "+c1.getClass());
		System.out.println("s Name      : "+c.getName());
		System.out.println("s HashCode  : "+c.hashCode());
		System.out.println("s1 Name     : "+c1.getName());
		System.out.println("s1 HashCode : "+c1.hashCode());
		System.out.println(c==c1);
		System.out.println(s==s1);
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m) {
			System.out.println("Methods : "+m1);
		}
		Field[] f =c.getDeclaredFields();
		for(Field f1 : f) {
			System.out.println("Fields : "+f1);
		}
	}

}
