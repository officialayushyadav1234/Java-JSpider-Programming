package String_Program;

import java.util.Scanner;

public class FindMissingDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Size: ");
		int size = sc.nextInt();
		System.out.println("ENter the String: ");
		sc.nextLine();
		String s1 = sc.nextLine();
		getMissingDigit(s1, size);
	}

	public static void getMissingDigit(String s1, int size) {
		int sum = size * (size + 1) / 2;
		int str_sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			str_sum = str_sum + (s1.charAt(i) - 48);
		}
		System.out.println("The Missing Digit is: " + (sum - str_sum));
	}
}
