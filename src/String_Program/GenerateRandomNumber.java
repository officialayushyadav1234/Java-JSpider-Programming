package String_Program;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {

		Random r1 = new Random();
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt(1000));
		int m = 1000;
		int n = 9999;
		int ran_number = r1.nextInt(n - m + 1) + m;
		System.out.println("OTP is: " + ran_number);
	}

}
