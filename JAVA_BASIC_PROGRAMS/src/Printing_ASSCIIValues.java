import java.util.*;
public class Printing_ASSCIIValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character to find asccii value: ");
		char ch = scan.next().charAt(0);  //to take char as input
		
		
		int n = ch;
		System.out.println("the asscii value of " + ch + " is: " + n);
		

	}

}
