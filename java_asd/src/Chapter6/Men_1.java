package Chapter6;

import java.util.Scanner;

public class Men_1 {
	static int w1 = 60;
	static int w2 = 40;

	public static void main(String[] args) {

		Ev ev = new Ev();

		Scanner sc = new Scanner(System.in);

		System.out.println("층 수 입력");
		int cho = sc.nextInt();

		ev.floor_no(w1, w2, cho);

		Ev ev1 = new Ev();

	}

}
