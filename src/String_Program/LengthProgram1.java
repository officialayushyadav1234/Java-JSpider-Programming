package String_Program;

public class LengthProgram1 {

	public static void main(String[] args) {

		String s1 = "abc de xyz";
		s1 = s1 + '\0';
		int count = 0;
		int i = 0;
		while (true) {
			if (s1.charAt(i) == '\0')
				break;
			count++;
			i++;
		}
		System.out.println("Lenth of " + s1 + " =" + count);
	}
}
