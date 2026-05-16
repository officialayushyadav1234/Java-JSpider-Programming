package Bitwise_Operator;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base: ");
		double x = sc.nextDouble();
		System.out.println("Enter the exponent: ");
		int n = sc.nextInt();
		if (n < 0) {
			n = -n;
			x = (1 / x);
		}
		double pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * x;
		}
		System.out.println("The Power value is: " + pow);
	}
}
