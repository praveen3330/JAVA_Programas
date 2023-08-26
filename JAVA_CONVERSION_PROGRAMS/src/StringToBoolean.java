
public class StringToBoolean {

	public static void main(String[] args) {
		// We can convert String to boolean in java using Boolean.parseBoolean(string) method.
		//To convert String into Boolean object, we can use Boolean.valueOf(string) method which returns instance of Boolean class.
		
		String s = "harish";
		boolean b = Boolean.valueOf(s);
		System.out.println(b);
		
		String s1 = "false";
		boolean b1 = Boolean.valueOf(s1);
		System.out.println(b1);
		
		String s2 = "true";
		boolean b2 = Boolean.valueOf(s2);
		System.out.println(b2);

	}

}
