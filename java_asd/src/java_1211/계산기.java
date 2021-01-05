package java_1211;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 몇개의 항을 입력할건가.
		// for문으로 질문 갯수
		// 덧셈
		// for문으로 배열로 숫자 받기

		boolean run = true;
		int sum = 0;

		while (run) {

			Scanner sc = new Scanner(System.in);
			System.out.println("몇개의 항을 생성할까요?");
			System.out.println(" => ");
			int cho = sc.nextInt();
			int array[] = new int[cho];

			for (int i = 0; i < cho; i++) {
				System.out.println((i + 1) + "번째 숫자 입력");
				int num = sc.nextInt();
				array[i] = num;

			}

			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			System.out.println("다 합한 값은 :" + sum);
			System.out.println("-------------------------------------");
			System.out.println("1. 계산  2. 그만두기");
			int a = sc.nextInt();

			if (a == 1) {
				sum = 0;
				continue;
			} else if (a == 2) {
				run = false;
			}
		}
	}
}