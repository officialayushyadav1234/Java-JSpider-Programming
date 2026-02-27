package String_Program;

import java.util.Scanner;

public class PasswordValidator2 {

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
			if (c == ' ')
				return false;
			if (c >= 65 && c <= 90)
				uppercase++;
			else if (c >= 97 && c <= 122)
				lowercase++;
			else if (c >= 48 && c <= 57)
				digit++;
			else
				specialchar++;
		}
		if (uppercase > 1 && lowercase > 1 && digit > 0 && specialchar > 1)
			return true;
		return false;
	}

}
