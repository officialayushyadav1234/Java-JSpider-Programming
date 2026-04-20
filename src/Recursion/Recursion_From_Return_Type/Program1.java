package Recursion.Recursion_From_Return_Type;

public class Program1 {

	public static void main(String[] args) {

		System.out.println("Main Method Starts !!");
		test();
		System.out.println("Main Method Ends !!");

	}

	public static int test() {

		System.out.println("This is Test MEthod ");
		return test();
	}
}
