package Java_1207;
import java.util.Scanner;

public class while_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요.");
		String str = sc.next();
		int sum = 0;
		
		for (int i = 0; i<str.length();i++) {
			char num = str.charAt(i);
			int a=num;
			sum+=a;
		}
		System.out.println("총합은"+sum);
	}

}
