package String_Program;

import java.util.Random;

public class GeneratePassword {

	public static void main(String[] args) {

		char[] pwd = generatePassword();
		System.out.println("The Password is: ");
		for (char k : pwd)
			System.out.print(k);
	}

	public static char[] generatePassword() {
		int m = 8;
		int n = 20;
		Random r1 = new Random();
		int len = r1.nextInt(n - m + 1) + m;
		char[] pwd = new char[len];

		return pwd;
	}
}
