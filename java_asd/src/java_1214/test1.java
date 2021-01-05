package java_1214;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		boolean run1 = true;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Turn (1. On/2. Off)");
		int turn = sc.nextInt();
		int channel = 0;
		
		int vol = 0;
		while (run) {
		switch(turn) {
		
		case 1: 
			System.out.println("📺");			
				System.out.println("1. Channel Select   2. Vol control");
				
				int function = sc.nextInt();
				while (run1) {
				switch(function) {
				case 1: 
					 
					channel = Channel_select(channel);
					
					  if (channel==999) {
						  run1 = false;
						  
						  
					  }else {
						  System.out.println("현재 채널"+channel);
						  
					  }
					  continue;
				case 2: 
					vol = Vol_control(vol);
					System.out.println("현재 볼륨 : "+vol);
					
				}	break;		
				}
		}
		
		}
		}	
	
	public static int Channel_select(int channel) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1 : up  2 : down  3 : Input Channel number  4 : out");
		int function = sc.nextInt();
		switch(function) {
		case 1: 
			channel = channel+1;
			
			break;
		case 2: 
			channel = channel-1;
			
			break;
		case 3: 
			System.out.println("Input Channel number");
			channel = sc.nextInt();
			break;
		case 4: channel = 999;
		break;
			
		
		
		}return channel;
		
		
	}
	
	public static int Vol_control(int vol) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : up  2 : down");
		int cho = sc.nextInt();
		switch (cho) {
		case 1 : 
			vol = vol+1;
			break;
		case 2 : 
			vol = vol-1;
			break;
		}
		return vol;
	}
	
	
	
	

}