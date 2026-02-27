package String_Program;

import java.util.Scanner;

public class UniqueAndDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1 = sc.nextLine();
		getUniqueCharacter(s1);
	}

	public static void getUniqueCharacter(String s1) {
		int countunique = 0;
		int countduplicates = 0;
		String unique = "";
		String duplicate = "";
		int[] p = new int[256];
		for (int i = 0; i < s1.length(); i++)
			p[s1.charAt(i)]++;
		for (int i = 0; i < p.length; i++) {
			if (p[i] == 1) {
				unique = unique + (char) i;
				countunique++;
			} else if (p[i] > 1) {
				duplicate = duplicate + (char) (i);
				countduplicates++;
			}
		}
		System.out.println("All Unique characters are: " + unique);
		System.out.println("All Duplicate characters are: " + duplicate);
		System.out.println("\nTotal Unique characters are: " + countunique);
		System.out.println("Total Duplicate characters are: " + countduplicates);
	}

}
