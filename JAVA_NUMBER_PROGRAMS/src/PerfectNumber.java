import java.util.Scanner;
import java.lang.Math;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Number to check perfect number or not: ");
		int num = scan.nextInt();
		double d;
		d = Math.sqrt(num);
		System.out.println(d);
		
		//The Java Math floor() is a mathematical function available in Java Math Library. This function returns the closest integer 
		//value (represented as a double value) which is less than or equal to the given double value.
		//For example, if we pass 5.67 to the Math floor() function, we will get 5.0 as the output.
        boolean b = (d-(Math.floor(d))==0);
        
        if(b) {
        	System.out.println("The given number is perfect number");
        }
        else {
        	System.out.println("The given number is not perfect number");
        }
	}

}
