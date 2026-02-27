package String_Program;

import java.util.Scanner;

public class PanargramString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		if (checkPanagram(s1))
			System.out.println("The String is Panagram!");
		else
			System.out.println("The String is NOT Panagram!");
	}

	public static boolean checkPanagram(String s1) {
		int[] count1 = getCount(s1);
		for (int i = 0; i < count1.length; i++) {
			if (count1[i] == 0)
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
