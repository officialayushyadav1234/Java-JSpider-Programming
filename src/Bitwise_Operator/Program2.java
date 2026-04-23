package Bitwise_Operator;

public class Program2 {

	public static void main(String[] args) {

		byte a = 127;
		byte b = 127;
		byte c = 6;
		byte d = (byte) (a + b + c);

		short e = (short) (a + b + c);

		int f = a + b + c;

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
