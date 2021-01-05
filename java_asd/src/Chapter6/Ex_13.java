package Chapter6;

import java.util.Scanner;

public class Ex_13 {
	public static String getRole(int age) {
		String str = "";
		if (age >= 18) {
			str = "성인";
		} else if (13 <= age) {
			str = "청소년";
		} else if (age >= 6) {
			str = "어린이";
		} else if (age <= 5) {
			str = "유아";
		}

		return str;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		String role = getRole(age);
		System.out.println(role);
	}
}
