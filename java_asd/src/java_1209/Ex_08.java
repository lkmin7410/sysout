package java_1209;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("연산자를 입력하세요. + - * /");
		String str = sc.next();
		System.out.println("두번째 숫자를 입력하세요.");
		int num3 = sc.nextInt();
		
		int result = 0;
		
		switch(str) {
		case "+" : int sum = num1+num3;
		System.out.println(sum);
		result += sum;
				break;
		}
		
		
		
		
		
		
		
		
		
	}

}
