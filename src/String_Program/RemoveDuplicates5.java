package String_Program;

import java.util.Scanner;

public class RemoveDuplicates5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		removeDuplicates(s1);
	}

	public static void removeDuplicates(String s1) {
		s1 = s1 + '\0';
		int len = 0;
		for (int i = 0;; i++) {
			if (s1.charAt(i) == '\0')
				break;
			len++;
		}
		int leng = len + 1;
		for (int i = 0; i < len; i++) {
			int j;
			for (j = len + 1; j < leng; j++) {
				if (s1.charAt(i) == s1.charAt(j))
					break;
			}
			if (j == leng) {
				s1 = s1 + s1.charAt(i);
				leng++;
			}
		}
		for (int i = len + 1; i < leng; i++)
			System.out.print(s1.charAt(i));
	}
}
