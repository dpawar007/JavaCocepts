package jvmclsinfo;

public class ClassLoaderFiles {

	public static void main(String[] args) {
		System.out.println(String.class.getClassLoader());
		System.out.println(Student.class.getClassLoader());
		System.out.println(Test.class.getClassLoader());
		}
}
