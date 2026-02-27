package String_Program;

public class LengthProgram {

	public static void main(String[] args) {

		String s1 = "mohan anxyzd sohan  ";
		s1 = s1 + '\0';
		int len = s1.indexOf('\0');
		System.out.println("The Length is: " + len);
	}
}
