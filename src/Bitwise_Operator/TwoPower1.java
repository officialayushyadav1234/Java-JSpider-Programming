package Bitwise_Operator;

import java.util.Scanner;

public class TwoPower1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String result = ((n & (n - 1)) == 0) ? "The Number is 2's Power" : "The Number is NOT 2's Power";
		System.out.println(result);
	}
}
