package String_Program;

import java.util.Scanner;

public class RemoveDuplicates3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		removeDuplicates(s1);
	}

	public static void removeDuplicates(String s1) {
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			int j;
			for (j = 0; j < s2.length(); j++) {
				if (s2.charAt(j) == x)
					break;
			}
			if (j == s2.length())
				s2 = s2 + x;
		}
		System.out.println(s2);
	}
}
