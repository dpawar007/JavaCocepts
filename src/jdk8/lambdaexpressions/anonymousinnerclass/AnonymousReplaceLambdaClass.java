package jdk8.lambdaexpressions.anonymousinnerclass;

public class AnonymousReplaceLambdaClass {

	public static void main(String[] args) {
		
//		Runnable runnable = () -> {
//			for (int a = 0; a < 5; a++) {
//				System.out.println("Child Thread");
//			}
//		};
		 

		Thread thread = new Thread(() -> {for (int a = 0; a < 5; a++) {System.out.println("Child Thread");}});
		thread.start();
		for (int a = 0; a < 5; a++) {  
			System.out.println("Main Thread");
		}
	}
}
