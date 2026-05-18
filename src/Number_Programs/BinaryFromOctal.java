package Number_Programs;

import java.util.Scanner;

public class BinaryFromOctal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		getOctal(n);
	}

	public static void getOctal(int n) {

		String oct = "";
		while (n > 0) {

			int rem = n % 8;
			oct = rem + oct;
			n = n / 8;
		}
		System.out.println("The Octal Number is :" + oct);
	}
}
