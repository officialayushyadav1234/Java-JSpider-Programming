package String_Program;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number of string ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] k = new String[n];
		for (int i = 0; i < k.length; i++) {
			System.out.print("Enter String " + (i + 1) + ": ");
			k[i] = sc.nextLine();
		}
		sortString(k);
	}

	public static void sortString(String[] k) {
		int n = k.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (k[i].compareToIgnoreCase(k[j]) > 0) {
					String temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		System.out.println("======Sorted Elements are=======");
		for (String p : k)
			System.out.println(p);
	}

}
