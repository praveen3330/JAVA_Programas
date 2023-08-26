import java.util.Scanner;
public class StringToFloat {

	public static void main(String[] args) {
	
		//We can convert String to float in java using Float.parseFloat() method.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string value to convert into Float: ");
		String s = scan.nextLine();
		float f  = Float.parseFloat(s);
		System.out.println(f);
		

	}

}
