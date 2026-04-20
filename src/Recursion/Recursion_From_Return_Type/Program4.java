package Recursion.Recursion_From_Return_Type;

public class Program4 {

	public static void main(String[] args) {

		System.out.println("Main Method Ends !!");
		char x = test(5);
		System.out.println("X is :" + x);
		System.out.println("Main Method Ends !!");
	}

	public static char test(int x) {

		if (x > 1) {
			System.out.println("This is Test Method !!");
			return test(x - 1);
		} else
			return '@';
	}
}
