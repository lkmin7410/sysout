package test;

import java.util.Scanner;

public class Coding_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("몇항 연산?");
		int cho = sc.nextInt();

		int number[] = new int[cho + 1];
		double sum = 0;

		for (int i = 1; i <= cho; i++) {
			System.out.println("입력" + (i) + ":");
			number[i] = sc.nextInt();

			if (i == cho) {
				System.out.println("연산자 입력");
				String str = sc.next();

				switch (str) {
				case "+":
					for (int j = 0; j < number.length; j++) {
						sum += number[j];
					}
					System.out.println(sum);
					break;

				case "-":
					for (int j = 0; j < number.length; j++) {
						sum -= number[j];
					}
					System.out.println(sum);
					break;

				case "*":
					for (int j = 0; j < number.length; j++) {
						if (sum == 0) {
							sum = number[1];
						} else {
							sum *= number[j];
						}
					}
					System.out.println(sum);

					break;

				case "/":
					for (int j = 0; j < number.length; j++) {
						if (sum == 0) {
							sum = number[1];
						} else {
							sum /= number[j];
						}
					}
					System.out.println(sum);
					break;
				}
			}
		}
	}

}
