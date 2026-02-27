package String_Program;

import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the 2nd String: ");
		String s2 = sc.nextLine();
		if (checkAnagram(s1, s2))
			System.out.println("The String are Anagram!");
		else
			System.out.println("The String are NOT Anagram!");
	}

	public static boolean checkAnagram(String s1, String s2) {
		int[] count1 = getCount(s1);
		int[] count2 = getCount(s2);
		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != count2[i])
				return false;
		}
		return true;
	}

	public static int[] getCount(String s) {
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x >= 65 && x <= 90)
				count[x - 65]++;
			else if (x >= 97 && x <= 122)
				count[x - 97]++;
		}
		return count;
	}
}
