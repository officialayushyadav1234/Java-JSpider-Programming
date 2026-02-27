package String_Program;

import java.util.Scanner;

public class FirstCharUpperCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		System.out.println(getUpperCase(s1));
	}

	public static String getUpperCase(String s1) {
		String result = "";
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			if ((i == 0 && x != ' ' || s1.charAt(i - 1) == ' ' && x != ' ') && x >= 97 && x <= 122)
				result = result + (char) (x - 32);
			else
				result = result + x;
		}
		return result;
	}
}
