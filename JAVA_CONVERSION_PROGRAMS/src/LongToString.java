import java.util.Scanner;
public class LongToString {

	public static void main(String[] args) {
		
		// We can convert long to String in java using String.valueOf() and Long.toString() methods.
		
		Scanner scan = new Scanner(System.in);
	/*	System.out.println("Enter the long value to convert into string: ");
		long l = scan.nextLong();
		String s = String.valueOf(l);
		System.out.println("The long value is converted to string " + s + " : " );   */
		
		long l1 = 999999999L;
		String s2 = String.valueOf(l1);
		System.out.println("The long value is converted to string " + s2 + " : " );
		
		
		long l2 = 9999999990L;
		String s3 = Long.toString(l2);
		System.out.println("The long value is converted to string " + s3 + " : " );
		
		
		
	/*	System.out.println("Enter the long value to convert into string: ");
		long i = scan.nextLong();
		String s1 = Long.toString(i);
		System.out.println("The long value is converted to string " + s1 + " : " );     */
		 
		
	}

}
