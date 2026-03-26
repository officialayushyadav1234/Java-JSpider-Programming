package Recursion;

public class Program1 {

	public static void main(String[] args) {

		System.out.println("Main Method Starts !! ");

		int x = Power1.getPower(3, 5);

		System.out.println(x);
		test();
		System.out.println("Main Method Ends!");

	}

	public static void test() {

		System.out.println("This is Test Method!!");

		test();
	}
}
