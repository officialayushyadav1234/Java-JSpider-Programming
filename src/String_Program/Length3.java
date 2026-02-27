package String_Program;

public class Length3 {

	public static void main(String[] args) {

		String s1 = "abc c";
		char[] p = s1.toCharArray();
		int count = 0;
		for (char x : p)
			count++;

		System.out.println("Total length of [" + s1 + "] is =" + count);
	}
}
