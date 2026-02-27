package String_Program;

import java.util.Scanner;

public class WordFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		getWordFrequecny(s1);
	}

	public static void getWordFrequecny(String s1) {
		String[] p = getArray(s1);
		int big = 0;
		String bigword = "";
		int n = p.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (p[i].equalsIgnoreCase(p[j])) {
					count++;
					p[j] = p[n - 1];
					n--;
					j--;
				}
			}
			if (count > big) {
				// System.out.println(p[i]+" ==> "+count+" times");
				big = count;
				bigword = p[i];
			}
		}
		System.out.println(bigword);
	}

	public static int countWord(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i == 0 && c != ' ' || s.charAt(i - 1) == ' ' && c != ' ')
				count++;
		}
		return count;
	}

	public static String[] getArray(String s1) {
		String[] p = new String[countWord(s1)];
		int j = 0;
		String word = "";
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			if (x != ' ')
				word = word + x;
			if (x == ' ' && !word.isBlank() || i == s1.length() - 1) {
				p[j] = word;
				word = "";
				j++;
			}
		}
		return p;
	}
}
