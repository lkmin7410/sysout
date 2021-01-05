package java_1211;

import java.util.Random;
import java.util.Scanner;

public class 축구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			System.out.println("어디 막을것인가.");
			System.out.println("                 | 1 | 2 | 3 |  ");
			System.out.println("                 | 4 | 5 | 6 |  ");
			System.out.print("==> : ");
			int k = sc.nextInt(); // 내가 막을 곳
			System.out.println("나는 1,4번을 막을것이다.");
			int shot = rd.nextInt(5) + 1; // 컴퓨터 슛팅
			System.out.println("컴퓨터는" + shot + "번에 찰것이다.");
			int shot_2 = rd.nextInt(2);

			if (shot == k) {
				if (shot_2 == 0) {
					System.out.println("50%확률로 막았습니다.");
					continue;

				} else {
					System.out.println("50%확률로 막지못했습니다.");
				}
			}
			if (shot == k + 3) {
				System.out.println("막았습니다.");
				System.out.println("==================================");
			} else {
				System.out.println("골 먹음");
				System.out.println("==================================");

			}
		}

	}
}
