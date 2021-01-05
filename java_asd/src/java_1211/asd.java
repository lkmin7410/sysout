package java_1211;
import java.util.Scanner;
public class asd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean onoff = false;
		boolean run = true;
		int sound = 0;
		int channel = 0;
		int select = 0;

		while (run) {
			boolean run2 = true;
			System.out.println("--만능 리모컨--");
			if (onoff == false) {
				System.out.println("현재상태 :: 꺼져있습니다.");
			} else {
				System.out.println("현재상태 :: 켜져있습니다.");
			}

			System.out.println("1. 전원 ON/OFF 2. 음량 조절 3. 채널 조절");
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("전원을 끄거나 킵니다.");
				onoff = !onoff;
				break;
			case 2:
				if (onoff == false) {
					System.out.println("전원을 켜세요");
				} else {
					while (run2) {
					System.out.println("음량 조절 입니다. 현재음량 :: " + sound);
					System.out.println("1. 음량 올리기 2. 음량 내리기 3. 음량 조절 종료");
					select = sc.nextInt();
					if (select == 1) {
						if (sound >= 40) {
							System.out.println("더 이상은 못 올립니다. 현재음량 :: " + sound);
						} else {
							sound += 1;
							System.out.println("음량을 올립니다. 현재음량 :: " + sound);
						}
					}
					if (select == 2) {
						if (sound <= 0) {
							System.out.println("더 이상은 못 내립니다. 현재음량 :: " + sound);
						} else {
							sound -= 1;
							System.out.println("음량을 내립니다. 현재음량 :: " + sound);
						}
					}
					if (select == 3) {
						run2 = false;
					}
				}
				}
				break;
			case 3:
				if (onoff == false) {
					System.out.println("전원을 켜세요");
				} else {
					while (run2) {
					System.out.println("채널 조절 입니다. 현재채널 :: " + channel + "번");
					System.out.println("1. 채널 올리기 2. 채널 내리기 3. 직접 입력 4. 채널 조절 종료");
					select = sc.nextInt();
					if (select == 1) {
						if (channel == 100) {
							channel = 0;
							System.out.println("채널을 올립니다. 현재채널 :: " + channel + "번");
						} else {
							channel += 1;
							System.out.println("채널을 올립니다. 현재채널 :: " + channel + "번");
						}
					}
					if (select == 2) {
						if (channel == 0) {
							channel = 100;
							System.out.println("채널을 내립니다. 현재채널 :: " + channel + "번");
						} else {
							channel -= 1;
							System.out.println("채널을 내립니다. 현재채널 :: " + channel + "번");
						}
					}

					if (select == 3) {
						System.out.println("채널을 입력 하세요. 현재채널 :: " + channel + "번");
						select = sc.nextInt();
						if (select < 0 || select > 100) {
							System.out.println("1~100까지만 입력하세요.");
						} else {
							channel = select;
							System.out.println(channel + "번으로 이동.");
						}
					}
					if (select == 4) {
						run2 = false;
					}
				}
				}
				break;
			} // switch문
		}
	}

}