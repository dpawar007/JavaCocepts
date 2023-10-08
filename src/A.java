public class A {
	public static void main(String args[]) { 
		System.out.println(String.class.getClassLoader());
		System.out.println(Student.class.getClassLoader());
		System.out.println(Test.class.getClassLoader());
		long mb = 1024*1024;
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Max Memory "+runtime.maxMemory()/mb);
		System.out.println("Total Memory "+runtime.totalMemory()/mb);
		System.out.println("Free Memory "+runtime.freeMemory()/mb);
		System.out.println("Consumed memory  "+((runtime.totalMemory()/mb) -(runtime.freeMemory())/mb));
	}       
}
 class Student{}
 class Test{}
 