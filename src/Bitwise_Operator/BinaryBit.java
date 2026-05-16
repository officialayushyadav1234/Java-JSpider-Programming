package Bitwise_Operator;

import java.util.Scanner;

public class BinaryBit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		int a = n;
		String bin = "";

		while (n != 0) {
			bin = (n & 1) + bin;
			n = n >>> 1;

		}
		System.out.println(a + "=>" + bin);
	}
}
