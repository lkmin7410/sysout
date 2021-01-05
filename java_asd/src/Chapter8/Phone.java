package Chapter8;

import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
		boolean run = true;
		Book_array list = new Book_array();

		while (run) {
			// 객체배열이 매개변수.
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("--\n ★★★ 1.입력 2.출력 ★★★");
			int select = sc.nextInt();
			System.out.println("--");

			switch (select) {
			case 1:
				list.add();
				break;
			case 2:
				list.print();
			}
		}
	}
}

