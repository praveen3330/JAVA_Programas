import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
public class DateToString {

	public static void main(String[] args) {
		
		
		//We can convert Date to String in java using format() method of java.text.DateFormat class.
		
	    Date date = (Date) Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);  
        System.out.println("Converted String: " + strDate);  



	}

}
