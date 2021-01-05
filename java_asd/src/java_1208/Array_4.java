package java_1208;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 파일 객체 생성
			File file = new File("C:\\workspace\\number.txt");

			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split("-| |@");
				
				
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]+"x"+array[i+1]+"="+array[i+2]);
					i+=2;
//					System.out.println(array[i]);
									
		
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);

		}
	}
}
