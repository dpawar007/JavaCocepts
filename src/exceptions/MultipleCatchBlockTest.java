package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultipleCatchBlockTest {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br=new BufferedReader(new FileReader("abc.txt"))){
			System.out.println("Dipak");
			throw new ArithmeticException("/ Zero");
 		} catch (Exception e) {
 			e.printStackTrace();
 			System.out.println();
 			System.out.println(e);
 			System.out.println();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally");
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			System.out.println("Dipak");
			throw new ArithmeticException("/ Zero");
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e ) {
			e.printStackTrace();
		} catch (ClassCastException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
