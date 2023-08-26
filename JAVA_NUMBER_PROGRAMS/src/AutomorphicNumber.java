import java.util.Scanner;
public class AutomorphicNumber {
	int square;
	int count =0;
	int count1 = 0;
	
	public void automorphic(int num) {
		int num1 = num; 
		while(num1 > 0) {
			int rem = num1%10;
			count++;
			num1 = num1 / 10;
		}
		square = num * num;
		while(num>0) {
			if(num%10 != square%10) {
				System.out.println("the given number is not automorphic");
				break;
			}
			else {
				count1++;
				num = num/10;
				square = square/10;
			}
		}
		if(count == count1) {
			System.out.println("the given number is automorphic");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check automorphic or not: ");
		number = scan.nextInt();
		AutomorphicNumber a = new AutomorphicNumber();
		a.automorphic(number);
		

	}

}
