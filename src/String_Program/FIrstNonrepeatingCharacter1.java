package String_Program;

import java.util.Scanner;

public class FIrstNonrepeatingCharacter1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		System.out.println(getCharacter(s1));
	}

	public static String getCharacter(String s1) {
		int[] p = new int[256];
		for (int i = 0; i < s1.length(); i++)
			p[s1.charAt(i)]++;
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			if (p[x] == 1) {
				return x + " is 1st Non repeating charater at index: " + i;
			}
		}
		return "There is no non repeating character!!";
	}
}
