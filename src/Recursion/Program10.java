package Recursion;

public class Program10 {

	public static void main(String[] args) {

		test(3);
	}

	public static void test(int x) {
		if (x == 1) {
			System.out.println("From if :" + x);
			return;
		}
		test(x - 1);
		System.out.println("Out if :" + x);
		test(x - 1);
	}
}
