package exceptions;

public class SimpleExampeofException {
	
	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		doStuff();
	}

}
