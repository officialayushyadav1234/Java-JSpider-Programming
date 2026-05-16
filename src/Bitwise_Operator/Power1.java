package Bitwise_Operator;

import java.util.Scanner;

public class Power1 {

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
		while (n > 0) {
			if ((n & 1) == 1)
				pow = pow * x;

			x = x * x;
			n = n >>> 1;
		}
		System.out.println("The Power value is: " + pow);
	}
}
