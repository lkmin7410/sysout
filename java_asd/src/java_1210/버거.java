package java_1210;

import java.util.Scanner;

public class 버거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		int $ = 0;
		int money = 0;
		
		
		while (run) {
			
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("뭐 먹을래");
		System.out.println("1. 세트  2. 버거 ");
		int a = sc.nextInt();
		
		switch (a) {
		
		
		case 1 : System.out.println("어떤 세트?  1.  와퍼   2.  불고기");
				int s = sc.nextInt();
				
				if (s==1) {
					$ = 5000;
					System.out.println("와퍼세트 :"+$+"원 입니다.");
					money+=$;
					
				}else if (s==2) {
					$ = 4000;
					System.out.println("불고기세트 :"+$+"원 입니다.");
					money+=$;
				}
				break;
		
		case 2 : System.out.println("어떤 버거?  1. 데리  2. 치킨");
				int b = sc.nextInt();
				
				if(b==1) {
					$ = 2000;
					System.out.println("데리 :"+$+"원 입니다.");
					money+=$;
				}else if (b==2) {
					$ = 2500;
					System.out.println("치킨 :"+$+"원 입니다.");
					money+=$;
					
				}
				break;
				
				
				
				}System.out.println("추가 주문?   1. 예   2. 아니오");
				int c = sc.nextInt();
				
				if (c==1) {
					continue;
				}else if (c==2) {
					
					run = false;
				}
				
				System.out.println("총 금액은 :"+money+"원 입니다.");
				
				
		}
		
		
		

		}
	}

