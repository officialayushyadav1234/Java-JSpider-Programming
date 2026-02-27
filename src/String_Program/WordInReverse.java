package String_Program;

import java.util.Scanner;

public class WordInReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		printWord(s1);
	}

	public static void printWord(String s1) {
		String word = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char x = s1.charAt(i);
			if (x != ' ')
				word = x + word;
			if ((x == ' ' || i == 0) && !word.isBlank()) {
				System.out.print(word + " ");
				word = "";
			}
		}
	}

}
