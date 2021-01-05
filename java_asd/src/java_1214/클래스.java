package java_1214;

import java.util.Scanner;

public class 클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇항 계산을 하시겠습니까?");
		int count = sc.nextInt(); // 항 갯수를 받음
		int num[] = new int[count]; // 항 갯수만큼 배열 생성
		for (int i = 0; i < count; i++) { // for 문 돌림
			num[i] = count_process(i); // count_process
		}
		String cal = cal();
		
		int sum = 0;
		
		
		switch (cal) {
		case "+" :
			for (int i = 0; i<count; i++) {
			sum = plus(sum,num[i]);
		}
			break;
			
			
		case "-" :
			for (int i= 0; i<count; i++) {
				sum = minus(i,sum,num[i]);
			}break;
		}
			
		
		
			System.out.println(sum);
	}

	public static int count_process(int count) {
		Scanner sc = new Scanner(System.in);
		System.out.println(count + 1 + " 번 째 숫자를 입력해주세요.");
		int num = sc.nextInt();
		return num;
	}

	public static String cal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 연산을 하시겠습니까?");
		String str = sc.nextLine();
		return str;
	}

	public static int plus(int sum, int num) {

		sum += num;
		return sum;
	}

	public static int minus(int i, int sum, int num) {
		if (i == 0) {
			sum = num;
		} else {
			sum -= num;
		}
		return sum;
	}
}

