package String_Program;

import java.util.Scanner;

public class FirstNonRepeatingCharacter2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		System.out.println(getCharacter(s1));
	}

	public static String getCharacter(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int j;
			for (j = 0; j < s1.length(); j++) {
				if (i != j && c == s1.charAt(j))
					break;
			}
			if (j == s1.length())
				return c + " is 1st non-repeating character at index: " + i;
		}
		return "There is no non-repeating cgaracter availaible";
	}
}
