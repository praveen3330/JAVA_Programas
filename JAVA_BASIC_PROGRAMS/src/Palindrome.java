import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome or not: ");
        int number = scan.nextInt();
        int number1 = number;
        int b = 0;
        while(number1>0) {
        	b = (b * 10) + (number1 % 10);
        	number1 = number1/10;
        }
        if(number == b) {
        	System.out.println(number + " is a palindrone");
        }
        else {
        	System.out.println(number + " is not a palindrone");
        }
	}

}
