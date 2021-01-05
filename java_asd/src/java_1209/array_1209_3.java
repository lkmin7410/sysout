package java_1209;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class array_1209_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			// 파일 객체 생성
			File file = new File("C:\\workspace\\number_1.txt");

			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split("-|\\+|@|");
				
				
				int io = str.indexOf("+");
				String plus = str.substring(io,io+1);
				String sub_1 = str.substring(0,io);
				String sub_2 = str.substring(io, str.length());
				
				System.out.println(sub_1+sub_2);
				
				

				
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);

		}

	}

}
