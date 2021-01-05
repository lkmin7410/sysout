package Chapter6;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("시급 입력");
		int pay = sc.nextInt();
		System.out.println("일 한 시간 입력");
		int work = sc.nextInt();
		
		int sum = pay*work;
		System.out.println(sum);
		
	}

}
