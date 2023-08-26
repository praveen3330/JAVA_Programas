import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not: ");
        int number = scan.nextInt();
        for(int i=1;i<=number;i++) {
        	if(number % i == 0) {
        		count++;
        	}
        }
        if(count>2) {
        	System.out.println(number + " " + "is not a prime number");
        }
        else {
        	System.out.println(number + " " + "is a prime number");
        }
	}

}
