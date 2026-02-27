package String_Program;

import java.util.Scanner;

public class RemoveDuplicates2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		removeDuplicates(s1);
	}

	public static void removeDuplicates(String s1) {
		String res = "";
		for (int i = 0; i < s1.length(); i++) {
			String k = s1.charAt(i) + "";
			if (!res.contains(k))
				res = res + k;
		}
		System.out.println(res);

	}
}
