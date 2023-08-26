import java.util.*;
public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of series you want: ");
		int number = scan.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");
		for(int i=2;i<=number;i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		

	}

}
