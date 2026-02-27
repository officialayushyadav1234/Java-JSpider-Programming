package String_Program;

import java.util.Scanner;

/* by using an array of 
 * size 256 frequency is being
 * calculated
 */
public class PrintFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		getFrequency(s1);
	}

	public static void getFrequency(String s1) {
		// s1=s1.toLowerCase();
		int[] p = new int[256];
		for (int i = 0; i < s1.length(); i++)
			p[s1.charAt(i)]++;
		for (int i = 0; i < p.length; i++) {
			if (p[i] > 0 && i != 32)
				System.out.println((char) i + " is: " + p[i] + " times!");
		}
	}
}
