import java.util.Scanner;

public class StringToDouble {

	public static void main(String[] args) {
		
		//We can convert String to double in java using Double.parseDouble() method.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to convert into double: ");
		String s = scan.nextLine();
		double d = Double.parseDouble(s);
		System.out.println(d);

	}

}
