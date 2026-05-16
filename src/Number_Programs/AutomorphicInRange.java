package Number_Programs;

import java.util.Scanner;

public class AutomorphicInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int n = sc.nextInt();
		int au_count = 0;
		System.out.println("All automorphic numbers upto " + n + " are Below");
		for (int i = 1; i <= n; i++) {
			if (isAutomorphic(i)) {
				System.out.println(i);
				au_count++;
			}
		}
		System.out.println("Total are: " + au_count);
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
