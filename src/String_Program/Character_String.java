package String_Program;

public class Character_String {

	public static void main(String[] args) {

		char x = '@';
		Character c1 = 't';
		Character c2 = '3';
		Character c3 = '@';

		System.out.println("=====" + Character.isLetter(64));

		System.out.println(Character.isLetter(c1));

		System.out.println(Character.isDigit(c2));

		System.out.println(Character.isLetterOrDigit(c1));
		System.out.println(Character.isLetterOrDigit(c2));

		System.out.println(!Character.isLetterOrDigit(c3));
	}
}
