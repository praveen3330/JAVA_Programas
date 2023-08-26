import java.lang.Math;           // we have to import math class
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we will get only double values by using this method for int there is another way
        System.out.println("First random number is " + Math.random()); //  Math.random() is used to get random numbers
        System.out.println("Second random number is " + Math.random());
        
        int max = 400;
        int min = 200;
        int random = (int) (Math.random() * (max - min + 1) + min);  //to get value between 200 to 400;
        System.out.println(random);
        
        
	}

}
