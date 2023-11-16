package jdk8.lambdaexpressions.anonymousinnerclass;

public class AnonymousClass {

	public static void main(String[] args) {
		Runnable anrunnable = new Runnable() {
			@Override
			public void run() {
				for (int a = 0; a < 5; a++) {
					System.out.println("Child Thread");
				}
			}
		};

		Thread thread = new Thread(anrunnable);
		thread.start();
		for (int a = 0; a < 5; a++) {
			System.out.println("Main Thread");
		}
	}
}
