package Pattern_Program;

import java.util.Scanner;

// Star Pattern
public class Pattern1 {

	public static void main(String[] args) {
		printPattern();
	}

	public static void printPattern() {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the no. of rows: ");
		int x = sc.nextInt();
		System.out.println("ENter the no. of columns: ");
		int y = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
