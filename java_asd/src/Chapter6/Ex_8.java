package Chapter6;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int num1 = num%10;
		System.out.println(num1);
		int num2 = num/10%10;
		System.out.println(num2);
		int num3 = num/100;
		System.out.println(num3);
		
		int sum = num1+num2+num3;
		
		System.out.println(sum);
		
	}

}
