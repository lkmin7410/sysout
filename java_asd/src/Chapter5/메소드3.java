package Chapter5;

import java.util.Random;
import java.util.Scanner;

public class 메소드3 {

	public static int dice(int num) {
		Random rd = new Random();
		int a = rd.nextInt(num)+1;
		System.out.println(a);
		return a;
	}
	public static int dice2(int num1) {
		Random rd = new Random();
		int a = rd.nextInt(num1)+1;
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		int num1 = dice(num);
		int num2 = dice2(num1);
		
		System.out.println(num2);
	}

}
