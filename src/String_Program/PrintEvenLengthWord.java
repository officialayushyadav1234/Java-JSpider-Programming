package String_Program;

import java.util.Scanner;

public class PrintEvenLengthWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		printWord(s1);
	}

	public static void printWord(String s1) {
		int count = 0;
		String word = "";
		for (int i = 0; i < s1.length(); i++) {
			char x = s1.charAt(i);
			if (x != ' ')
				word = word + x;
			if (x == ' ' && !word.isBlank() || i == s1.length() - 1) {
				if (word.length() % 2 == 0) {
					System.out.println(word);
					count++;
				}
				word = "";
			}
		}
		System.out.println("Total Even Words are: " + count);
	}
}
