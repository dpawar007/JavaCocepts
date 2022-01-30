package multithreding;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal l = new ThreadLocal();
		System.out.println(l.get());
		l.set("Dipak");
		System.out.println(l.get());

	}

}
