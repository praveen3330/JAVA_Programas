import java.util.Scanner;
public class Reverse_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to Reverse: ");
		int number = scan.nextInt();
		int number1=number;
		int n = 0;
		
		while(number1>0) {
			n = n * 10 + (number1%10);
			number1 = number1/10;
			
		}
		System.out.println("Reverse of a given number is: " + n);

	}

}
