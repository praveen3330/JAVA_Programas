import java.util.Scanner;

public class PetersonNumber {
	
	public void peterson(int num) {
		int sum = 0;
		int num1 = num;
		while(num1>0) {
			int fact = 1;
			int rem = num1%10;
			for(int i=1;i<=rem;i++) {
			    fact = fact*i;
			}
			sum = sum + fact;
			num1 = num1/10;	
		}
		if(sum == num) {
			System.out.println("The given number is peterson");
		}
		else {
			System.out.println("The given number is not a peterson");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		PetersonNumber p = new PetersonNumber();
		p.peterson(number);
		
	}

}
