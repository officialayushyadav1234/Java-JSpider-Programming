package Number_Programs;

import java.math.BigInteger;

public class BigIntegerNumber {

	public static void main(String[] args) {
		int i = 10;
		BigInteger b1 = new BigInteger(i + "");
		BigInteger b2 = new BigInteger("12");
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.mod(b2));
		System.out.println(b1.max(b2));
		System.out.println(b1.min(b2));
	}
}
