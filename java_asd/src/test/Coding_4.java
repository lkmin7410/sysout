package test;

import java.util.Scanner;

public class Coding_4 {
	
	
static	Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coding_4_ch c = new Coding_4_ch();
		
		while(true) {
		
		System.out.println("1. 채널 | 2. 볼륨 | 3. 전원");
		int cho = sc.nextInt();
		
		switch (cho) {
		case 1 :
			c.channel();
			break;
		case 2 :
			c.volume();
			
			break;
		case 3 :
			c.power();
			break;
			
		}
		}
		
	}

}
