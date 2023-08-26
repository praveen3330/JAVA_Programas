import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		
	/*	We can convert String to an int in java using Integer.parseInt() method. To convert String into Integer,
		we can use Integer.valueOf() method which returns instance of Integer class. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string in number format: ");
		String s = scan.nextLine();    
		int a = 100;
		int i = Integer.parseInt(s);     //converting string to int
		System.out.println(i);
		System.out.println(a+s);
		System.out.println(a+i);
		
		System.out.println();
		
		System.out.println("Enter the string in number format: ");
		String s1 = scan.nextLine();    
		int a1 = 100;
		Integer i1 = Integer.valueOf(s1);     //converting string to Integer  (Wrapper class)
		System.out.println(i1);
		System.out.println(a1+s1);
		System.out.println(a1+i1);
		
		System.out.println();
		
		System.out.println("Enter the string in number format: ");   // Entering string instead of int
		String s2 = scan.nextLine();    
		int a2 = 100;
		Integer i2 = Integer.valueOf(s2);     //converting stringvalue(giving HI as input) to int is number format exception
		System.out.println(i2);
		System.out.println(a2+s2);
		System.out.println(a2+i2);

	}

}
