package String_Program.Example;

public class Program2 {

	public static void main(String[] args) {

		String s1 = new String("mohan");
		String s2 = new String("mohan");
		String s3 = "rohan";
		String s4 = "rohan";
		System.out.println(s1 == s2); // Given Boolean Value
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2)); // Given Boolean Value
		System.out.println(s1.equals(s3)); // Given Boolean Value

	}
}
