import java.util.Scanner;
public class String_To_Long {
	
	// We can convert String to long in java using Long.parseLong() method.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string value to convert long: ");
		String s = scan.nextLine();
		long l = Long.parseLong(s);
		System.out.println("The string value changed to long " + l + " : ");

	}

}
