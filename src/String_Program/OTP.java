package String_Program;

import java.util.Random;

public class OTP {

	public static void main(String[] args) {

		int num = getOTP(120, 200);
		System.out.println(num);
	}

	public static int getOTP(int m, int n) {

		Random r1 = new Random();
		int ran_number = r1.nextInt(n - m + 1) + m;
		return ran_number;
	}
}
