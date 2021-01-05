package Chapter5;

import java.util.Scanner;

public class 매소드2 {

	public static int leng(String a) {
		int cnt = a.length();
		return cnt;
	}

	public static String[] sub(int leng, String str) {
		String str_array[] = new String[leng];
		for (int i = 0; i < leng; i++) {
			str_array[i] = str.substring(i, i + 1);
		}
		return str_array;
	}

	public static void print(String array[]) {
		for (String k : array) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int leng = leng(str);
		String str_array[] = new String[leng];
		str_array = sub(leng, str);
		print(str_array);

	}

}
