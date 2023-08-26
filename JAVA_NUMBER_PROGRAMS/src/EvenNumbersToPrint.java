import java.util.Scanner;

public class EvenNumbersToPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number to print Even numbers: ");
		int num = scan.nextInt();
		System.out.print("The Even numbers from 1 to " + num + " are : ");
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}

	}

}
