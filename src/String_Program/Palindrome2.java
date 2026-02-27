package String_Program;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		if (checkPalindrome(s1))
			System.out.println("The String entered is Palindrome");
		else
			System.out.println("The String entered is NOT a Palindrome");
	}

	public static boolean checkPalindrome(String s1) {
		s1 = s1.toLowerCase();
		int len = s1.length();
		for (int i = 0; i < len / 2; i++) {
			if (s1.charAt(i) != s1.charAt(len - i - 1))
				return false;
		}
		return true;
	}
}
