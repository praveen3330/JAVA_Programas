import java.util.*;
import java.lang.Math;

public class ArmstongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check the armstrong or not: ");
        int number = scan.nextInt();
        int number1 = number;
        int count = 0;
        int sum = 0;
        while(number1>0) {           //  counting no of digits in given number
        	number1 = number1/10;
        	count++;
        }
        System.out.println("No of digits in given number is " + count);
        number1 = number;
       
        
        while(number1>0) {       //Logic to check armstrong
        	int a = number1%10;
        	number1 = number1/10;
        	sum = (int) (sum +(Math.pow(a,count))); //concentrate on this line
        }
        if(sum == number) {
        	System.out.println("Given number is Armstrong number");
        }
        else {
        	System.out.println("Given number is not a Armstrong number");
        }
	}

}
