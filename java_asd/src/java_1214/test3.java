package java_1214;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i = 10;
		int j = 20;
		int hap = 0;

		hap = plus(i, j);

		System.out.println(hap);

	}

	public static int plus(int i, int j) {
		int sum = i + j;

		sum = minus(sum);
		return sum;
	}

	public static int minus(int sum) {

		sum -= 5;
		return sum;

	}
}

//int i,j,k,m;
//int sum = 0;
//
//i = 10;
//j = 20;
//k = 30;
//m = 40;
//
//sum = per(j);
//
//System.out.println(sum);
//
//
//}
//
//public static int per(int i) {
//
//int sum = i/2;
//
//return sum;

//		System.out.println("문자 입력");
//		String str = sc.next();
//		boolean b = string_boo(str);
//		if (b == true) {
//			int idx = string_idx(str);
//			System.out.println("! 표는 " + idx + "번째에 위치하고 있다.");
//		} else {
//			System.out.println("!가 없습니다.");
//		}
//
//	}
//
//	public static boolean string_boo(String s) {
//
//		boolean b = s.contains("!");
//		return b;
//
//	}
//
//	public static int string_idx(String s) {
//		int idx = s.indexOf("!");
//		return idx;
//	}
//
//}