package Code_test;

import java.util.Scanner;

public class Buger {
static	int cnt = 0;
static	String buger_sum [] = new String[5];
static	String drink_sum [] = new String[5];


static	String b_name[] = {"불고기 버거","치킨 버거","비프 버거","새우 버거"};
static	int b_price[] = {2500,2900,3500,3300};
static	String d_name[] = {"콜라","사이다","환타","아이스티"};
static	int d_price[] = {1000,1000,1000,1500};

	
	void buger() {
		System.out.println();
		for(int i = 0; i<b_name.length;i++) {
			System.out.println((i+1)+". "+b_name[i]+" : "+b_price[i]);
		} buger_cho();
	}
	
	void buger_cho() {
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int cho = sc.nextInt();
		buger_sum[cnt] = b_name[cho-1];
		System.out.println(buger_sum[cnt]);
		cnt++;
	}
	
	void drink() {
		System.out.println();
		for(int i = 0; i<d_name.length;i++) {
			System.out.println((i+1)+". "+d_name[i]+" : "+d_price[i]);
		} drink_cho();
	}
	void drink_cho() {
		Scanner sc = new Scanner(System.in);
		System.out.print("선택 : ");
		int cho = sc.nextInt();
		drink_sum[cnt] = d_name[cho-1];
		System.out.println(drink_sum[cnt]);
		cnt++;
	
	}
}
