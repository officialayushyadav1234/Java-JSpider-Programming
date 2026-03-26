package Recursion;

public class Program8 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts!");

		test(10);
		System.out.println("Main method Ends !!");
	}

	public static void test(int x) {

		if (x > 0) {
			System.out.print(x + " ");
			test(x - 1);
		}
	}
}
