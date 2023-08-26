import java.util.Scanner;

public class FindingNthPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nth number: ");
		int nth = scan.nextInt();
		
		int count=0,num = 1,i;
		
		while(count<nth) {
			num = num+1;
			for( i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				count=count+1;
			}
		}
		System.out.println("The " +nth +" th prime number is: " + num);  
	}

}
