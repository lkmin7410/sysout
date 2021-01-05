package java_1211;

import java.util.Scanner;

public class 리모컨 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int volume = 0;
		String channel = "";
		String arr[] = {"+"};

		System.out.println("1. Tv를 켠다.    2. Tv를 끈다.");
		int power = sc.nextInt();

		while (run) {

			switch (power) {

			case 1:
				System.out.println("1.[음량]  2.[채널]");
				int ri = sc.nextInt();

				if (ri == 1) {
					System.out.println(" [ + ]     [ - ] ");
					String vol = sc.next();

					if (vol.equals("+")) {
						volume++;

					} else if (vol.equals("-")) {
						volume--;
					}
					System.out.println("현재 음량은 :" + volume + "입니다.");
				}

				if (ri == 2) {

					System.out.println("1   2   3");
					System.out.println("4   5   6");
					System.out.println("7   8   9");
					System.out.println("    0    ");
					System.out.println("         ");
					System.out.println("[-]   [+]");
					System.out.println("         ");

					System.out.print("==>");

					String num = sc.next();
				
					if(num.equals("+")) {
					int c = Integer.parseInt(num);
					if(c>=0 && c<=100) {
						channel = num+1;
					
					}
					}
				}
				
				System.out.println("현재 채널은 " + channel + "번 입니다.");

			

		}

	}
}
}

