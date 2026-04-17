package Recursion;

import java.util.Scanner;

public class Power {

	static int pow = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a: ");
		int a = sc.nextInt();
		System.out.println("ENter b: ");
		int b = sc.nextInt();

		getPower(a, b);
		System.out.println(a + " to power " + b + " is: " + pow);
	}

	public static void getPower(int a, int b) {
		if (b > 0) {
			pow = pow * a;
			getPower(a, b - 1);
		}
	}

}
