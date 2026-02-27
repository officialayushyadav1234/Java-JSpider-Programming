package String_Program;

import java.util.Scanner;

public class RemoveDuplicates1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		removeDuplicates(s1);
	}

	public static void removeDuplicates(String s1) {
		int n = s1.length();
		char[] x = s1.toCharArray();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (x[i] == x[j]) {
					x[j] = x[n - 1];
					j--;
					n--;
				}
			}
		}
		String res = "";
		for (int i = 0; i < n; i++) {
			res = res + x[i];
		}
		System.out.println(res);
	}
}
