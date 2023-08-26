import java.util.*;
public class RightTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
