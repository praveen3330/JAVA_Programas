import java.util.Scanner;
public class FloatToString {

	public static void main(String[] args) {
		
		// We can convert float to String in java using String.valueOf() and Float.toString() methods.
		
		Scanner scan = new Scanner(System.in);
		float f1 = 63.5f;
		String s = Float.toString(f1);
		System.out.println(s);
		
		float f2 = 364.5f;
		String s1 = String.valueOf(f2);
		System.out.println(s1);

	}

}
