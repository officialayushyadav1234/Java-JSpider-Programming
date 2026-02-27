package Pattern_Program;

import java.util.Scanner;

//Alphabet triangle
public class Pattern13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter n: ");
		int n = sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		char x = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}
	}
}
