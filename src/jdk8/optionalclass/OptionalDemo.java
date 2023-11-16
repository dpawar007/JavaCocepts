package jdk8.optionalclass;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {	 
			 
		  String str = "";  		   
		  Optional<String> optional  = Optional.ofNullable(str);        	      	       
	      boolean isEmpty = optional.map(json -> !json.isEmpty()).orElse(true);
	      
	      if(isEmpty)
	    	  System.out.println("JSON NOT EMPTY");
	      else
	    	  System.out.println("JOSN IS EMPTY");
	      
		  System.out.println(optional.isPresent());		  
		  System.out.println(optional.get());
		  System.out.println(optional.orElse("No value in this object"));
		  
		  
	}

}
