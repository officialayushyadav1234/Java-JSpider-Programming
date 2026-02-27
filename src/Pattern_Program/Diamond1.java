package Pattern_Program;

import java.util.Scanner;

public class Diamond1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter n: ");
		int n = sc.nextInt();
		printPattern(n);
	}

	public static void printPattern(int n) {
		int x = 1;
		String s1 = " ";
		int star = 1;
		int space = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.printf("%3s", s1);
			}
			for (int j = 1; j <= star; j++) {
				System.out.printf("%3d", x);
				x++;
			}
			if (i < n / 2 + 1) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}
	}
}
