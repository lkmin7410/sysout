package java_1208;

import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 입금, 무제한 2. 출금 잔액 0 출금 x, 3.현재 금액 조회

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int money = 0;

		while (run) {
			System.out.println("무엇을 하시겠습니까?   1. 입금  2. 출금  3. 잔액 조회  4. 나가기");
			int cho = sc.nextInt();

			switch (cho) {
			case 1:
				System.out.println("입금 하실 금액을 입력해주세요.");
				int money_in = sc.nextInt();
				System.out.println(money_in + "원을 입금 하셨습니다.");
				money += money_in;
				break;

			case 2:
				System.out.println("출금 하실 금액을 입력해주세요.");
				int money_out = sc.nextInt();

				if (money < money_out) {
					System.out.println("출금할 수 없습니다. 잔액을 확인해주세요.");

				} else {
					System.out.println(money_out + "원을 출금 하셨습니다.");
					money -= money_out;
				}
				
				break;

			case 3:

				System.out.println("현재 금액은 :" + money + "원 입니다.");
				break;

			case 4:

				System.out.println("이용해주셔서 감사합니다.");
				run = false;
				break;

			}

		}
	}
}
