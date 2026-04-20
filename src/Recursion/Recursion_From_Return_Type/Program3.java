package Recursion.Recursion_From_Return_Type;

public class Program3 {

	public static void main(String[] args) {

		System.out.println("Main Method Starts ");
		String x = test(4);
		System.out.println("X is :" + x);
		System.out.println("Main Method Ends !!");
	}

	public static String test(int x) {

		if (x > 1) {
			System.out.println("This is Test Method !!");
			return test(x - 1);
		} else {
			return "Mohan is Here !! ";
		}
	}
}
