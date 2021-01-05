package Chapter5;

import java.util.Random;
import java.util.Scanner;

public class lotto {

	public static int[] lotto() {
		Random rd = new Random();
		int num[] = new int[6];

		for (int i = 0; i < 6; i++) {
			num[i] = rd.nextInt(44) + 1;

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					System.out.println("중복숫자");
					i--;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num[] = lotto();

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
