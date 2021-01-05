package Chapter6;

import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		1 유로 = 1320.48026 원
//				1 달러 = 1063.82979 원
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("유로를 입력하세요");
		int euro = sc.nextInt();
		System.out.println("달러를 입력하세요");
		int dollar = sc.nextInt();
		
		double euro_t = 1320.48026;
		double dollar_t = 1063.82979;
		
		int won = (int)(euro * euro_t + dollar * dollar_t);
        System.out.println(euro+"유로"+"+"+dollar+"달러"+"="+ won +" 원");
		
	}

}
