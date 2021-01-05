package Chapter5;

import java.util.Scanner;

public class Men {

	static int money = 20000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		bugerking buger = new bugerking();
		System.out.println("무엇을 먹을래 ? bug1 bug2");
		int i = sc.nextInt();

		sum = buger.pay(money, i);

		System.out.println("잔액은"+sum);

	}

}
