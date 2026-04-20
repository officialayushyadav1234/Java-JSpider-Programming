package Recursion;

import java.util.Scanner;

public class BigNumber1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		int a = sc.nextInt();
		int big = a;
		char c;
		do {

			System.out.println("Enter the Next Number :");
			int b = sc.nextInt();
			big = getBig(big, b);
			System.out.println("Press Y/y to Enter the Next Number : ");
			c = sc.next().charAt(0);

		} while (c == 'Y' || c == 'y');
		System.out.println("The Biggest Number is : " + big);
	}

	public static int getBig(int a, int b) {
		return a > b ? a : b;
	}
}
