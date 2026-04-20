package Recursion.Recursion_From_Return_Type;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char c;
		do {
			System.out.println("Enter the Number :");
			int n = sc.nextInt();
			System.out.println(n + " ! = " + getFactorial(n));
			System.out.println("Press Y/y to Find Another Number Factorial : ");
			c = sc.next().charAt(0);
		} while (c == 'Y' || c == 'y');
	}

	public static int getFactorial(int n) {

		if (n > 1)
			return n * getFactorial(n - 1);
		else
			return n;
	}
}
