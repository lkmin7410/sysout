package Code_test;

import java.util.Scanner;

public class Kiosk {
	
	
static	String choice[] = {"주문","결제"};
static	String Kategorie[] = {"버거","음료","사이드"};
	

	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Buger b = new Buger();
		boolean run = true;
		
		
		System.out.println("★경민이 버거★");
		System.out.println("=============================");
		System.out.println();
		
		while(run) {
		
		
		for(int i = 0; i<choice.length; i++	) {
			System.out.println((i+1)+". "+choice[i]);
		}
		System.out.print("선택 : ");
		int cho = sc.nextInt();
		
		switch(cho) {
		
		case 1 : System.out.println();
				for(int i = 0; i<Kategorie.length;i++) {
					System.out.println((i+1)+". "+Kategorie[i]);
				}
				System.out.print("선택 : ");
				int cho1 = sc.nextInt();
				
				if(cho1==1) {
					b.buger();
				}else if(cho1==2) {
					b.drink();
				}
				break;
		
				
		case 2 :
			for(int i =0; i<b.buger_sum.length;i++) {
				System.out.println(b.buger_sum[i]+","+b.drink_sum[i]);
			}
		
		}
		}
		
	}

}
