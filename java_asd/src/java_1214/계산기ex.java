package java_1214;

import java.util.Scanner;

public class 계산기ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i = 10;
		int j = 20;

		int a = 300;
		int b = 400;

		int sum = plus(i, j);
		int sum2 = plus(a, b);

		System.out.println(sum2); // hap
		System.out.println(sum);

	}

	public static int plus(int i, int j) {
		int hap = i + j;
		
		return hap;
	}

}
