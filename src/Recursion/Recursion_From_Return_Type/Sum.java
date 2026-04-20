package Recursion.Recursion_From_Return_Type;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("Sum Upto " + n + " Natural Number is : " + getSum(n));
	}

	public static int getSum(int n) {

		if (n > 1)
			return n + getSum(n - 1);
		else
			return n;
	}
}
