package Java_1207;

import java.util.Scanner;

public class while_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("단 수를 입력해주세요.");
			int dan = sc.nextInt();

			for (int i = 1; i <= 9; i++) {

				System.out.println(dan + "x" + i + "=" + dan * i);
			}
			System.out.println("계속 하시겠습니까? 1. yes  2. no");
			int a = sc.nextInt();
			if (a == 1) {
				run = true;
			} else if (a == 2) {
				run = false;
			}
		}

	}
}
