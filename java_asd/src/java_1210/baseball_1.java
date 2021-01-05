package java_1210;

import java.util.Random;
import java.util.Scanner;
public class baseball_1 {

	//컨티뉴는 지정한값은 다시 반복?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int count_out = 0;
		while(run) {
			
		System.out.println("공을 던진다. 1. yes 2. no");
		int choice = sc.nextInt();
		
		Random rd = new Random();
		
		
		
		switch(choice){
		
		case 1 :
			
			System.out.println("공을 던졌다.");
			
			System.out.println("어디를 칠것인가? 1~9");
			int hit = sc.nextInt(); // 타격 위치
			
			int hit_1 = rd.nextInt(9); 
			
			if (hit==rd.nextInt(9)) {
				System.out.println("안타");
				}
			
			else {
				
				System.out.println("스트라이크");
				
				count_out+= 1;
				 
				 System.out.println(count_out);
				 
				if (count_out>2) {
					
					System.out.println("아웃");
					run = false;
					
				}
				
			}
			
		}
		
		
	}

}
}

	
	
