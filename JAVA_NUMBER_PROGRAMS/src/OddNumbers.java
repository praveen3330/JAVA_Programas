import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		System.out.println("The Odd numbers are: ");
		for(int i=1; i<=number ; i++) {
			if(i%2 == 1) {
				System.out.print(i + " " );
			}
		}

	}

}
