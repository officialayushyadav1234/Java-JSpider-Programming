package Recursion;

public class Program6 {

	public static void main(String[] args) {
		System.out.println("Main Method Starts!");
		test(1);

		System.out.println("MAin method ends!!");
	}

	public static void test(int x) {

		System.out.println("This is test Method :" + x);

		if (x <= 2) {
			test(x + 1);
		} else {
			System.out.println("Inside else the X is:" + x);
		}
		System.out.println("Outside the if else x is :" + x);
	}
}
