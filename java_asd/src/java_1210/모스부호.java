package java_1210;

import java.util.Scanner;

public class 모스부호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 글자를 알파벳으로 받는다.
		// charat으로 변환
		// 2진법으로 변환 숫자가 0이면 . 1이면 ㅡ

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하라");
		char c = ' ';
		String two = "";
		int num = 0;
		
		String str = sc.nextLine();
		String array[] = new String[100];
		

		for (int i = 0; i < str.length(); i++) {

			c = str.charAt(i);

			two = Integer.toBinaryString(c);
//			System.out.println(two);
			
			
		}
		for (int j = 0; j < two.length(); j++) {
			array[j] = two.substring(j, j + 1);
			
			System.out.println(array[j]);

			


		}

	}

}
