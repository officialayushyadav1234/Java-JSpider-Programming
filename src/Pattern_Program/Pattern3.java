package Pattern_Program;

import java.util.Scanner;

// Star Pattern Triangle
public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter n: ");
		int n = sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
