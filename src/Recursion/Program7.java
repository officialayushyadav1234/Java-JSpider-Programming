package Recursion;

public class Program7 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts !!");

		test(1);
		System.out.println("Main Method Ends!!");
	}

	public static void test(int x) {

		if (x <= 10) {
			System.out.println(x + " ");
			test(x + 1);
		}
	}
}
