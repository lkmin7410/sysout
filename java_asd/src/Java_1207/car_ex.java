package Java_1207;

import java.util.Scanner;

public class car_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean car_select = true;
		int car_select_flag = 0;
		boolean car_run = true;
		int car_run_flag = 0;
		
		
		System.out.println("차량을 선택해주세요. 1. 포르쉐 2. 벤츠 3. 소나타");

		int car_num = sc.nextInt();
		int speed = 0;
		int acc_speed = 0;
		int break_speed = 0;
		String car_name = "";
		int max_speed = 0;
		boolean run = true;
		
		
		
		switch(car_num) {
		case 1:
			
			car_name = "포르쉐";
			acc_speed = 10;
			break_speed = -10;
			max_speed =300;
			break;
		case 2:
			car_name = "벤츠";
			acc_speed = 8;
			break_speed = -8;
			max_speed =250;
			break;
		case 3:
			car_name = "소나타";
			acc_speed = 5;
			break_speed = -5;
			max_speed =200;
			break;
		}
			System.out.println(car_name+"을 선택하셨네요.");
			
			System.out.println(car_name+"로 계속 진행 하시겠습니까?  1. yes  2. no");
			car_select_flag = sc.nextInt();
			switch(car_select_flag) {
			       
			case 1: car_select = false;
			break;
			
				
				
			}
			System.out.println("-----------------------------------------");
			System.out.println("어떻게 하시겠습니까? (1. 가속   2. 감속)");
			int status = sc.nextInt();
			switch (status) {
			case 1 :
				speed= speed+acc_speed;
				System.out.println("현재 속도는"+speed);
				if(speed>max_speed) {
					System.out.println("더 이상 속도를 올릴 수 없습니다.");
					speed = max_speed;
				}
			
			case 2 :
				speed= speed-acc_speed;
				System.out.println("현재 속도는"+speed);
				if (speed<=0) {
					System.out.println("차량이 정차 했습니다.");
					speed = 0;
				}
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		int km = 0;
//		
//		boolean run = true;
//
//		while (run) {
//			System.out.println("무엇을 할까요? 1. 가속 2. 감속  3. 중지");
//			int a = sc.nextInt();
//			if (a == 1) {
//				System.out.println("가속 합니다.");
//				System.out.println("현재속도는" + (km + 5) + "km입니다.");
//				km += 5;
//			} else if (a == 2) {
//				System.out.println("감속 합니다.");
//				System.out.println("현재속도는" + (km - 5) + "km입니다.");
//				km -= 5;
//			}
//			else {
//				System.out.println("중지");
//				run = false;
//
//			}

//		}
	}

}
