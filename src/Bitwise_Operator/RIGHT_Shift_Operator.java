package Bitwise_Operator;

public class RIGHT_Shift_Operator {

	public static void main(String[] args) {

		int a = 12;
		int b = 23;
		int c = 34;

		System.out.println(a >> 2);
		System.out.println(b >> 2);
		System.out.println(c >> 3);
	}
}
/*
 * Signed Right Shift (>>): Moves bits to the right. The leftmost bit (sign bit)
 * is used to fill the empty spaces, which preserves the sign of the number.
 * 
 * -10 >> 1 remains negative.
 * 
 * Unsigned Right Shift (>>>): Moves bits to the right but always fills the
 * empty spaces with 0. This turns negative numbers into very large positive
 * numbers.
 */
