import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		
		//We can convert String to Date in java using parse() method of DateFormat and SimpleDateFormat classes.
		
		String s = "07/12/2022";
		Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s);  
		System.out.println(s + "\t" + d);
		

	}

}
