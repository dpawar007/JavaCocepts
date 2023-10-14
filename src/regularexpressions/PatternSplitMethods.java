package regularexpressions;

import java.util.regex.Pattern;

public class PatternSplitMethods {

	public static void main(String[] args) {
		//Pattern pattern = Pattern.compile("\\s");
		Pattern pattern = Pattern.compile("[.]");
		//String[] s = pattern.split("ashok software solutions");
		String[] s = pattern.split("ashoksoftware.solutions.com");
		for(String s1:s) {
			System.out.println(s1);
		}
		
		
		String string  = "Dipak887Hk#@";
		String[] d =  string.split("//w");
		for(String b:d) {
			System.out.println(b);
		}
	}

}
