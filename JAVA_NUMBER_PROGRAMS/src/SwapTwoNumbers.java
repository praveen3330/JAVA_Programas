import java.util.Scanner;
import java.lang.Math;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number of a: ");
		int a = scan.nextInt();
		
		System.out.println("Please Enter the number of b : ");
		int b = scan.nextInt();
		
		System.out.println("Before Swapping  ----  a = " + a + " b = " + b);
		a = a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping  ----  a = " + a + " b = " + b);
	}

}
