package String_Program;

import java.util.Scanner;

public class Palindrome1 {

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
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {
			rev = s1.charAt(i) + rev;
		}
		return s1.equalsIgnoreCase(rev);
	}
}
