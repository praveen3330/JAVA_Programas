import java.util.Scanner;

class NaturalNumbers{
	int sum;
	public void compute(int n) {
		sum = (n*(n+1)) / 2;
		System.out.println("The sum of n numbers is : " + sum);
	}
}

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = scan.nextInt();
		NaturalNumbers number = new NaturalNumbers();
		number.compute(n);

	}

}
