package Bitwise_Operator;

public class Shined_UnShined_Right_Shif_Operator {

	public static void main(String[] args) {

		int val = -10;

		// Signed: Preserves the negative sign
		System.out.println("-10 >> 1  = " + (val >> 1));
		// Output: -5

		// Unsigned: Becomes a massive positive number
		System.out.println("-10 >>> 1 = " + (val >>> 1));
		// Output: 2147483643
	}
}
