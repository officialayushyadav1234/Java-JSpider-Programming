package Number_Programs;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		if (isAutomorphic(n))
			System.out.println(n + " is a Automorphic Number");
		else
			System.out.println(n + " is NOT a Automorphic Number");
	}

	public static boolean isAutomorphic(int n) {
		int sq = n * n;
		while (n > 0) {
			if (n % 10 != sq % 10)
				return false;
			n = n / 10;
			sq = sq / 10;
		}
		return true;
	}
}
