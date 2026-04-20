package Recursion.Recursion_From_Return_Type;

public class Program2 {

	public static void main(String[] args) {

		System.out.println("Main Method Starts !!");
		int x = test(5);
		System.out.println("X is :" + x);
		System.out.println("Main Mehod Ends !!");

	}

	public static int test(int x) {

		if (x > 1) {
			System.out.println("This is Test Method ");
			return test(x - 1);
		} else
			return 5;
	}
}
