package Chapter5;

import java.util.Scanner;

public class 문제 {

	public static String[] sf() {
		System.out.println("sf 장르를 골랐습니다.");
		String sf[] = { "1. a", "2. b" };
		return sf;
	}

	public static String[] 액션() {
		System.out.println("액션 장르를 골랐습니다.");
		String sf[] = { "1. a", "2. b" };
		return sf;
	}

	public static String[] 로맨스() {
		System.out.println("로맨스 장르를 골랐습니다.");
		String sf[] = { "1. a", "2. b" };
		return sf;
	}

	public static String[] 코미디() {
		System.out.println("코미디 장르를 골랐습니다.");
		String sf[] = { "1. a", "2. b" };
		return sf;
	}

	public static String[] 판타지() {
		System.out.println("판타지 장르를 골랐습니다.");
		String sf[] = { "1. a", "2. b" };
		return sf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("장르  1. sf | 2. 액션 | 3. 로맨스 | 4. 코미디 | 5. 판타지");
		int cho = sc.nextInt();

		switch (cho) {
		case 1:
			String[] str = sf();
			for (String a : str) {
				System.out.println(a);
			}
			break;

		case 2:
			String[] str1 = 액션();
			for (String a : str1) {
				System.out.println(a);
			}
			break;

		}

	}

}
