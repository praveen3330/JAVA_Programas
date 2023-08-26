import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to get factorial: ");
		int number = scan.nextInt();
		int factor = 1;
		for(int i=1;i<=number;i++) {
			factor = factor * i;
		}
		System.out.println("Factors of " + number + " is " + factor);

	}

}
