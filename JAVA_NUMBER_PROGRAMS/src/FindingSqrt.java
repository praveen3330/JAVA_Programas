import java.util.*;
import java.lang.Math;

public class FindingSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number to find SQRT: ");
		int number = scan.nextInt();
		
		double result = Math.sqrt(number);
		System.out.println("The SQRT of " + number + " is: " + result);
		
		

	}

}
