package String_Program;

public class Convert {

	public static void main(String[] args) {

		char c1 = 'T';
		char result1 = (char) (c1 + 32);

		// add 32 to convert uppercase to lowercase character
		System.out.println(c1 + "==> " + result1);

		char c2 = 'm';
		char result2 = (char) (c2 - 32);

		// subtract 32 to convert lowercase to uppercase character
		System.out.println(c2 + "==> " + result2);
	}
}
