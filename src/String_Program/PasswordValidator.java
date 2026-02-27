package String_Program;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password: ");
		String pwd = sc.nextLine();
		if (isAValidPassword(pwd))
			System.out.println(pwd + " is a Valid Password!");
		else
			System.out.println(pwd + " is NOT a Valid Password!");
	}

	public static boolean isAValidPassword(String s1) {
		if (s1.length() < 8 || s1.length() > 20) {
			System.out.print("Password is too small..");
			return false;
		}
		int uppercase = 0;
		int lowercase = 0;
		int digit = 0;
		int specialchar = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (Character.isUpperCase(c))
				uppercase++;
			else if (Character.isLowerCase(c))
				lowercase++;
			else if (Character.isDigit(c))
				digit++;
			else if (!Character.isLetterOrDigit(c))
				specialchar++;

			if (uppercase > 0 && lowercase > 0 && digit > 0 && specialchar > 0)
				return true;
		}
		return false;
	}
}
