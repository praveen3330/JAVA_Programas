import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We can convert int to String in java using String.valueOf() and Integer.toString() methods. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to convert into string: ");
		int i = scan.nextInt();    
		int a = 100;
		String s = String.valueOf(i);     //converting int to string
		System.out.println(s);
		System.out.println(a+i);
		System.out.println(a+s);
		
		System.out.println();
		
		System.out.println("Enter the number to convert into string: ");
		int i1 = scan.nextInt();    
		int a1 = 100;
		String s1 = Integer.toString(i1);     //converting int to string
		System.out.println(s1);
		System.out.println(a1+i1);
		System.out.println(a1+s1);
		
		System.out.println();

	}

}
