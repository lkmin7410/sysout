package test;

import java.util.Scanner;

public class Coding_4_ch {
	
	Scanner sc = new Scanner(System.in);

static	int vol = 10;
static int cnt = 0;
	
		void channel() {
			
			if(cnt==0) {
				System.out.println("티비가 꺼져있습니다.");
			}else {
				System.out.println("채널 선택");
				int num = sc.nextInt();
				System.out.println("현재 채널은 "+num+"번 입니다.");
			}
		}
		
		void volume() {
			
			if(cnt==0) {
				System.out.println("티비가 꺼져있습니다.");
			}else {
			System.out.println("+" + "-");
			String cho = sc.next();
			
			switch(cho) {
			case "+" : 
				this.vol++;
				System.out.println("현재 볼륨은"+vol+"입니다.");
				break;
				
				
			case "-" :
				this.vol--;
				System.out.println("현재 볼륨은"+vol+"입니다.");
				break;
			}
			}
			
		}
		
		void power() {
			if(cnt==0) {
				System.out.println("티비를 켠다.");
				cnt++;
			}else if(cnt==1) {
				System.out.println("티비를 끈다.");
				cnt--;
				
			}
			
		}
}
