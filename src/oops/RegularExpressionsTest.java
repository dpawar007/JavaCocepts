package oops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTest {

	public static void main(String[] args) {
		int count=0;
		
	 /*Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbbabbaba");
		while(m.find()) {
			count++;
			System.out.println(m.start()+"------"+m.end()+"------"+m.group());
		}
		System.out.println("The no of occurences :"+count);
		*/
		//Pattern p1=Pattern.compile("[abc]");
		//Pattern p1=Pattern.compile("[^abc]");
		//Pattern p1=Pattern.compile("[0-9]");
		//Pattern p1=Pattern.compile("[a-z]"); //[a-zA-Z]  [a-zA-Z0-9] [^a-zA-Z0-9]		
    	//Pattern p1=Pattern.compile("a+");
		//Pattern p1=Pattern.compile("a*");
		//Pattern p1=Pattern.compile("a|b");
		//Pattern p1=Pattern.compile("a?");
		/*Matcher m1=p1.matcher("a1b7aa@z#");
		  while(m1.find())
		  {
			System.out.println(m1.start()+"-------"+m1.group());
		  }*/
		  
		 //Pattern p=Pattern.compile("\\s");
		 //String[] s=p.split("ashok software solutions");
		 
		/*String s="www.saijobs.com";
		  String[] s1=s.split("\\.");
		  for(String g:s1)
		  {
		  	System.out.println(g);		   
		  }*/
		  
	//System.out.println("String Tokenizer");
		
	//StringTokenizer st = new StringTokenizer("sai software solutions");
  /*    StringTokenizer st=new StringTokenizer("1,99,988",",");
   		while (st.hasMoreTokens()) {
  			System.out.println(st.nextToken());			 
 		}
  */
 		
     //Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-+#]+"); 
     //Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-#][a-zA-Z0-9-#] * ");
		  
	 /*	Matcher m = p.matcher(args[0]);
		if (m.find() && m.group().equals(args[0])) {
			System.out.println("valid identifier");
		} else {
			System.out.println("invalid identifier");
		}*/
		
      //Pattern p=Pattern.compile("[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
	    Pattern p=Pattern.compile("[7-9][0-9]{9}");
 		Matcher m = p.matcher(args[0]);
		if (m.find() && m.group().equals(args[0])) {
			System.out.println("valid number");
		} else {
			System.out.println("invalid number");
		}
	}

}
