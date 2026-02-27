package String_Program;

import java.util.Scanner;

public class RemoveDuplicates4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		removeDuplicates(s1);
	}

	public static void removeDuplicates(String s1) {
		s1 = s1 + '\0';
		for (int i = 0; i < s1.indexOf('\0'); i++) {
			int j;
			for (j = s1.indexOf('\0') + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j))
					break;
			}
			if (j == s1.length())
				s1 = s1 + s1.charAt(i);
		}
		for (int i = s1.indexOf('\0') + 1; i < s1.length(); i++)
			System.out.print(s1.charAt(i));

	}
}
