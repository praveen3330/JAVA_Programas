import java.util.Scanner;

public class GCD_Of_TwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number1: ");
		int number1 = scan.nextInt();
	
		
		System.out.println("Enter the number2: ");
		int number2 = scan.nextInt();
		int gcd = 1;

		for(int i=1;i<=number1 && i<=number2;i++) {
			if(number1%i == 0 && number2%i == 0) {
				gcd = i;
			}
		}
		System.out.println("The GCD of two " + number1 + " " + number2 + " is: " + gcd);
	}

}
