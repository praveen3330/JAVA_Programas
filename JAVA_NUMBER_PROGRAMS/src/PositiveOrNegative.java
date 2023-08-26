import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of number : ");
		int number = scan.nextInt();
		
		if(number>0) {
			System.out.println("The given number is positive " + number);
		}
		else {
			System.out.println("The given number is negative " + number);
		}

	}

}
