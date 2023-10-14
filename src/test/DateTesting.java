package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTesting {

	public static void main(String[] args) throws ParseException {
        String dateString = null;    
        Date bDate = null;
        if(dateString != null) {
        	bDate = new SimpleDateFormat("dd-MMM-yy", Locale.US).parse(dateString);
        }
        if(bDate!=null) {
        	final Date finalBDate = bDate;        
		    System.out.println("finalDate : "+finalBDate);
        }else {
        	final Date finalBDate = bDate;        
		    System.out.println("finalDate null : "+finalBDate);
        }

	}

}
