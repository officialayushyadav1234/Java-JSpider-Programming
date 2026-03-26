package Recursion;

public class Program3 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts!");
		test(1);

		System.out.println("MAin Method Ends!!");
	}

	public static void test(int x) {
		System.out.println("Test Method :" + x);

		if (x <= 100) {
			test(x + 1);
		}
	}
}
