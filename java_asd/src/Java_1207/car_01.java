package Java_1207;
import java.util.Scanner;
public class car_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean car_select = true;
		int car_select_flag = 0;
		boolean car_run = true;
		int car_run_flag = 0;
		String car_name = "";
		int speed = 0;
		int acc_speed = 0;
		int break_speed = 0;
		int max_speed = 0;

		while (car_select) {
			System.out.println(" 차량을 선택해 주세요  1. 포르쉐      2. 벤츠     3. 소나타");
			int car_num = sc.nextInt();

			switch (car_num) {
			case 1:
				car_name = "포르쉐";
				acc_speed = 10;
				break_speed = 10;
				max_speed = 300;
				break;

			case 2:
				car_name = "벤츠";
				acc_speed = 8;
				break_speed = 8;
				max_speed = 250;
				break;

			case 3:
				car_name = "소나타";
				acc_speed = 5;
				break_speed = 5;
				max_speed = 200;
				break;
			}

			System.out.println(car_name + " 을 선택하셨네요.");
			System.out.println(car_name + "로 계속 진행하시겠습니까?  1. YES   2. NO");
			car_select_flag = sc.nextInt();
			switch (car_select_flag) {
			case 1:
				car_select = false;
				break;
			case 2:
				car_select = true;
				break;
			}
		}

		while (car_run) {
			System.out.println("----------------------------------------");
			System.out.println("어떻게 하시겠습니까?  (1. 가속,  2. 감속,  3.정지");
			int status = sc.nextInt();
			switch (status) {
			case 1:
				speed = speed + acc_speed;
				if (speed > max_speed) {
					System.out.println("더 이상 속도를 올릴 수 없습니다.");
					speed = max_speed;
					System.out.println("현재 속도는 " + speed);
				}else {
				System.out.println("현재 속도는 " + speed);
				}
				break;

			case 2:
				speed = speed - break_speed;
			
				if (speed <= 0) {
					System.out.println("차가 정지 하였습니다.");
					speed = 0;
				}else {
					System.out.println("현재 속도는 " + speed);
				}
				break;
				
			case 3:
				System.out.println("차량을 정차했습니다.");
				System.out.println("---------------------------------------");
				System.out.println("다시 실행하시겠습니까?   (1. yes  2. no)");
				int i = sc.nextInt();
				if(i==1) {
					car_select = true;
					
				}else if(i==2) {
					car_run = false;
				}
				
				break;
				
			}
		}
	}

	

}
