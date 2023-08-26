import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		int number1 = scan.nextInt();
		System.out.println("Enter the number2 : ");
		int number2 = scan.nextInt();
		System.out.println("Enter the number3 : ");
		int number3 = scan.nextInt();
		
		if(number1 > number2) {
			if(number1 > number3) {
				System.out.println(number1 + " is the largest number");
			}
		}
		else if(number2 > number3) {
			System.out.println(number2 + " is the largest number");
		}
		else {
			System.out.println(number3 + " is the largest number");
		}

	}

}
