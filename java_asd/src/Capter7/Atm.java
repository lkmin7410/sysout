package Capter7;

import java.util.Scanner;

public class Atm {
	static boolean run = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Money m = new Money();

		while (run) {
			cho();
		}
	}

	static int in(Money m) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		return in;
	}

	static int out(Money m) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int out = sc.nextInt();
		if (out > m.money) {
			System.out.println("너 그렇게 돈이 많지 않아;;");
			return 0;
		}
		return out;
	}

	static void check(Money m) {
		System.out.println("현재 잔고 : " + m.money);
	}

	static void esc() {
		System.out.println("이용해줘서 땡큐");
		run = false;
	}

	static void cho() {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입금,  2. 출금,  3. 조회  4. 나가기");
		int cho = sc.nextInt();
		
		Money m = new Money();
		
		switch (cho) {
		case 1:
			m.money += in(m);
			break;

		case 2:
			m.money -= out(m);
			break;

		case 3:
			check(m);
			break;

		case 4:
			esc();
			break;
		}
	}
}
