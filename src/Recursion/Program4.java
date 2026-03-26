package Recursion;

public class Program4 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts!");
		test(1);

		System.out.println("MAin method ends!!");
	}

	public static void test(int x) {

		System.out.println("This is test Method :" + x);

		if (x <= 2) {
			test(x + 1);
		}
		System.out.println("Outside the X is:" + x);
	}
}
