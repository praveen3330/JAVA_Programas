
public class BooleanToString {

	public static void main(String[] args) {
		//The String.valueOf() method converts boolean to String
		//The Boolean.toString() method converts boolean to String. 

		boolean b = true;
		String s = Boolean.toString(b);
		System.out.println(s);
		
		boolean b1 = false;
		String s1 = Boolean.toString(b1);
		System.out.println(s1);
		
	}

}
