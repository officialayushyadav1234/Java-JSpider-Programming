package Recursion;

import java.util.Scanner;

public class CountDigit {

	static int count = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int a = sc.nextInt();
		System.out.println("Total Digit is :" + getCount(a));
	}

	public static int getCount(int n) {

		if (n > 0) {
			count++;
			getCount(n / 10);
		}
		return count;
	}
}
