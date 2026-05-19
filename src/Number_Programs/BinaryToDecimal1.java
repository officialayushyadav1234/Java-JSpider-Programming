package Number_Programs;

import java.util.Scanner;

public class BinaryToDecimal1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary Number: ");
		int n = sc.nextInt();
		getDecimal(n);
	}

	public static void getDecimal(int n) {
		int sum = 0;
		int twomul = 1;
		while (n > 0) {
			int rem = n % 10;
			if (rem == 0 || rem == 1)
				sum = sum + rem * twomul;
			else {
				System.out.println("This is Notb a valid Binary Number");
				return;
			}
			twomul *= 2;
			n = n / 10;
		}
		System.out.println("The decimal value is: " + sum);
	}
}
