package regularexpressions;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountTheTxtFileNumber {

	public static void main(String[] args) {
		int count = 0;
		//Pattern p = Pattern.compile("[a-zA-Z0-9-$.]+[.]txt");
		  Pattern p = Pattern.compile("[a-zA-Z0-9-$.]+[.]java");
		File f = new File("/home/dipak/git/JavaLearning/src/regularexpressions");
		String[] s = f.list();
		StringBuffer sb  = new StringBuffer();
		for(String s1:s) {
			Matcher m  = p.matcher(s1);
			if(m.matches()) {	
				count++;
				sb.append(count+" : "+s1);
				sb.append("\n");
		}
	   }
		System.out.println("Java File Count "+count);
		System.out.println("Files");
		System.out.println(sb);
  }
}
