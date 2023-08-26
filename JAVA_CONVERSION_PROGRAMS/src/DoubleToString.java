import java.util.Scanner;

public class DoubleToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the double value to convert into string: ");
		double d = scan.nextDouble();
		String s = Double.toString(d);
		System.out.println(s);

	}

}
