package jdk8.functionalinterfaces.functions;

import java.util.function.Function;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		String str = "Durga soft solutions limited";
		Function<String,String>  f =  s -> s.replace(" ", "");
		System.out.println(f.apply(str));
		
		Function<String,String>  f1 =  s ->  new StringBuffer(s).reverse().toString();
		System.out.println("Reverse the string : "+f1.apply(str));
		
		Function<String,Integer>  f2 =  s ->  s.length() - s.replace(" ", "").length();
		System.out.println("Count the spaces : "+f2.apply(str));
		
		
		

	}

}
