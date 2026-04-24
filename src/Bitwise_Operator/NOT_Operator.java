package Bitwise_Operator;

public class NOT_Operator {

	public static void main(String[] args) {

		int x = 24;
		int y = -23;
		int a = 2;
		int b = -3;

		System.out.println(~x);
		System.out.println(~y);
		System.out.println(~a);
		System.out.println(~b);
	}
}

/*
 * 
 * The bitwise NOT operator (~) is a unary operator that inverts every bit in a
 * number (turns 0s to 1s and 1s to 0s).In Java, integers are stored using Two's
 * Complement representation. Because of this, there is a very simple
 * mathematical shortcut to determine the result of a ~ operation without
 * manually calculating every bit: x = -(x + 1) $$Walking through your examples:
 * For x = 24:Formula: -(24 + 1) = -25 , For y = -23:Formula: -(-23 + 1) =
 * -(-22) = 22 , For a = 2:Formula: -(2 + 1) = -3 , For b = -3:Formula: -(-3 +
 * 1) = -(-2) = 2
 */
