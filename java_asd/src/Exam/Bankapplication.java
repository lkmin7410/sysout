package Exam;

import java.util.Scanner;

public class Bankapplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택 : ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
//				accountList();
			} else if (selectNo == 3) {
//				deposit();
			} else if (selectNo == 4) {
//				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("예금 주 : ");
		String owner = sc.next();
		
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		
		Account ac = new Account(ano, owner, balance);
		
		for(int i = 0; i <accountArray.length; i++ ) {
			if(accountArray[i]==null) {
				accountArray[i] = ac;
			}
		}System.out.println("계좌가 생성 되었습니다.");
	
	}
	
	private static void accountList() {
		
		for(int i = 0; i<accountArray.length;i++) {
			
		}
		
	}

}
