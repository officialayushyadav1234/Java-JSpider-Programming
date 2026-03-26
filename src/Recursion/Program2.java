package Recursion;

public class Program2 {
	public static void main(String[] args) {

		System.out.println("Main Method Starts!!");
		test(1);

		System.out.println("Main Method Ends!!");
	}

	public static void test(int x) {

		System.out.println("This is Test MEthod !!" + x);

		test(x + 1);
	}
}
