package java_1211;

import java.util.Scanner;

public class 계산기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true; // 계산기 가동
		boolean y = true;

		int sum = 0;
		double result = 0;
		int num2 = 0;
		int array[] = {};
		
		
		
		while (run) {

			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			sum += num;

			while (y) {
				
				System.out.println("연산자 입력  //   = 종료");
				String str = sc.next();

				switch (str) {
				case "+":
					System.out.println("숫자를 입력하세요.");
					num2 = sc.nextInt();
					result += (sum + num2);
					
					sum = 0;
					break;

				case "-":
					System.out.println("숫자를 입력하세요.");
					num2 = sc.nextInt();
					result -= (sum + num2);
					sum = 0;
					break;

				case "*":
					System.out.println("숫자를 입력하세요.");
					num2 = sc.nextInt();
					result *= (sum + num2);
					sum = 0;
					break;

				case "/":
					System.out.println("숫자를 입력하세요.");
					num2 = sc.nextInt();
					result /= (sum + num2);
					sum = 0;
					break;

				case "=":
					y = false;
					run = false;
					break;
				}
					System.out.println(" = " + result);

			}
		}

	}
}
