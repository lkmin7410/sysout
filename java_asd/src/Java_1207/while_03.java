package Java_1207;

import java.util.Scanner;

public class while_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while (run) {

			System.out.println("첫번째 숫자를 입력하세요.");
			int num1 = sc.nextInt();

			System.out.println("어떤 연산을 하시겠습니까? (+,-,*,/)로 입력해주세요.");
			String str = sc.next();

			System.out.println("두번째 숫자를 입력하세요.");
			int num2 = sc.nextInt();

			int sum = 0;
			double sum_1 = 0;

			switch (str) {

			case ("+"):
				sum = num1 + num2;
				break;
			case ("-"):
				sum = num1 - num2;
				break;
			case ("*"):
				sum = num1 * num2;
				break;
			case ("/"):
				sum_1 = (double) num1 / (double) num2;
				break;
			}if(str.equals("/")) {
				System.out.println(num1 + str + num2 + "=" + sum_1);
			}else {
			System.out.println(num1 + str + num2 + "=" + sum);
			}
			

			System.out.println("계속 하시겠습니까? 1, yes  2, no");
			int a = sc.nextInt();
			if (a == 1) {
				run = true;
			} else if (a == 2) {
				run = false;
			}
		}

	}

}
