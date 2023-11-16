  package jdk8.lambdaexpressions.functionalinterfaces;

public class PredefinedFunctionalRunnableDemo {

	public static void main(String[] args) { 
			Runnable r = ()-> {
				for(int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}				
			};
			
		Thread thread = new Thread(r);
		thread.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}				
	}
}
