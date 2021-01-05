package java_1208;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Try_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file_1 = new File("C:\\workspace\\test.txt"); // 불러오기
		File file = new File("C:\\workspace\\text.txt"); //저장
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
	
		
		

		try (FileWriter fileWriter = new FileWriter(file)) {
			Scanner sc = new Scanner(file_1);
			String str = "";
			String array[] = null; //초기화
			while (sc.hasNextLine()) {
				str = sc.nextLine();
				array = str.split("-|@| ");

			}
			PrintWriter pw = new PrintWriter(fileWriter);
			for (int i = 0; i < array.length; i++) {
				
				
				pw.print(array[i]+"||");
				
				
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
	
	

}
