package java_1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java_1209_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 파일 객체 생성
			File file = new File("C:\\workspace\\number_1.txt");

			Scanner sc = new Scanner(file);
			String str = sc.nextLine();
			String sub = "";
			int idx[] = new int[str.length()];
			System.out.println(str);
			for (int i = 0; i < str.length(); i++) {
				sub = str.substring(i, i + 1);
				if (sub.equals("+")) {
					int j = 0;
					j++;
					idx[j] = i;
				}else {
					continue;
				}
			}
			
			for (int i = 0; i <idx.length; i++) {
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e);

		}
	}

}
