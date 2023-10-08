package exceptions;

class CustomizedExcepltion extends RuntimeException{
		public CustomizedExcepltion(String e) {
			System.out.println(e);
		}
}
public class CustomizedfException {
 	 
	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {		  
		 throw new CustomizedExcepltion("This is some customized exeception!!!!");
	}
	
	public static void main(String[] args) {
		try {
		doStuff();
		}catch(Exception e) {
			System.out.println(e.toString());			 
	    } 
	}

}
