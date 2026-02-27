package String_Program;

import java.util.Scanner;

public class PrintUniqueCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		removeDuplicates(s1);
	}

	public static void removeDuplicates(String s1) {
		int[] x = new int[256];
		for (int i = 0; i < s1.length(); i++)
			x[s1.charAt(i)]++;
		System.out.println("==================");
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 1)
				System.out.print((char) i);
		}
	}
}
