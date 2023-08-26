import java.util.Scanner;

public class SmallNumberUsingTernaryOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a value: ");
		int a = scan.nextInt();
		System.out.println("Enter the b value: ");
		int b = scan.nextInt();
		System.out.println("Enter the c value: ");
		int c = scan.nextInt();
		
		int temp = (a<b) ?  a : b ;
		
		int res = (temp<c) ? temp : c;
		
		System.out.println("the smallest number between a,b,c is : " + res);
	}

}
