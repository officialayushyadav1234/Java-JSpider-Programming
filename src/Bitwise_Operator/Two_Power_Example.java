package Bitwise_Operator;

import java.util.Scanner;

public class Two_Power_Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int countX = 0;
		int count = 0;
		while (n != 0) {
			countX++;
			if ((n & 1) == 1)
				count++;
			n = n >>> 1;
		}
		if (count == 1)
			System.out.println("The Number is 2's Power");
		else
			System.out.println("The Number is NOT 2's Power");

		System.out.println("CountX is: " + countX);
	}
}
