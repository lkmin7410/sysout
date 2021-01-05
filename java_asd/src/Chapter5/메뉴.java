package Chapter5;

import java.util.Scanner;

public class 메뉴 {

	public static int cost(int a) {
		int sum = 0;
		int $[] = { 3000, 500, 1500, 2000 };

		sum += $[a];

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int sum = 0;

		String menu_list[] = { "라면", "어묵", "떡볶이", "순대"};
		int dor[] = { 3000, 500, 1500, 2000 };

		System.out.println("경민이의 킹갓제너럴엠페러충무공왕짱 맛잇는 분식집");

		while (run) {
			for (int i = 0; i < menu_list.length; i++) {
				System.out.print((i + 1) + ". " + menu_list[i]);
				System.out.println(" : " + dor[i]);
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("5. 계산");
			System.out.print("선택 : ");
			int cho = sc.nextInt();

			switch (cho) {

			case 1:
				System.out.println(menu_list[cho - 1] + ": " + dor[cho - 1] + "원");
				System.out.println();
				sum += cost(cho - 1);

				break;

			case 2:
				System.out.println(menu_list[cho - 1] + ": " + dor[cho - 1] + "원");
				System.out.println();
				sum += cost(cho - 1);

				break;
			case 3:
				System.out.println(menu_list[cho - 1] + ": " + dor[cho - 1] + "원");
				System.out.println();
				sum += cost(cho - 1);

				break;
			case 4:
				System.out.println(menu_list[cho - 1] + ": " + dor[cho - 1] + "원");
				System.out.println();
				sum += cost(cho - 1);

				break;

			case 5:
				System.out.println();
				System.out.println("총 결제 금액은 : " + sum + "원 입니다.");
				run =false;
				break;
			}

		}

	}

}
