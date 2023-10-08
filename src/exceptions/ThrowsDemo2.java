package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsDemo2 {

	public static void main(String[] args) {	 
		PrintWriter  out = null;
		try {
			out = new PrintWriter("abc.ser");
			System.out.println("afte file checked");
		}catch(FileNotFoundException f) {
			System.err.println("File Not Found Exception"+f);
		}catch(Exception e){
			System.err.println("Exception"+e);
		}finally {
			out.close();
		}
	}

}
