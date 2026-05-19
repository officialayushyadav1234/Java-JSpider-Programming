package Number_Programs;

import java.util.Scanner;

public class BianryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number: ");
		String s1 = sc.next();
		getDecimal(s1);
	}

	public static void getDecimal(String s1) {
		int sum = 0;
		int twomul = 1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c = s1.charAt(i);
			if (c == '0' || c == '1')
				sum = sum + (c - 48) * twomul;
			else {
				System.out.println("This is Notb a valid Binary Number");
				return;
			}
			twomul *= 2;
		}
		System.out.println("The decimal value is: " + sum);
	}
}
