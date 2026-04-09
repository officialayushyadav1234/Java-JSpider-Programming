package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	static int x = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Number of Disks: ");
		int n = sc.nextInt();
		getMoves(n, 'A', 'B', 'C');
		System.out.println("Total Moves: " + x);
	}

	public static void getMoves(int n, char s, char d, char h) {
		x++;
		if (n == 1) {
			System.out.println("Move Disk " + n + " From " + s + " To " + d);
			return;
		}
		getMoves(n - 1, s, h, d);
		System.out.println("Move Disk " + n + " From " + s + " To " + d);
		getMoves(n - 1, h, d, s);
	}
}
