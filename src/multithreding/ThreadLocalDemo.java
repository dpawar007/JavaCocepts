package multithreding;

public class ThreadLocalDemo { 
	public static void main(String[] args) {	
		ThreadLocal l = new ThreadLocal() {
			 @Override
			protected Object initialValue() {			 
				return "Initial Value";
			}
		};
		//ThreadLocal<String> tl = new ThreadLocal<String>();		 
		System.out.println("Initial value : "+l.get());
		l.set("Dipak");
		System.out.println("Initial value after set : "+l.get());
		l.remove();
		System.out.println("Initial value after remove : "+l.get());
		 
	}	

}
