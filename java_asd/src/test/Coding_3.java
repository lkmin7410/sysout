package test;

import java.util.Random;
import java.util.Scanner;

public class Coding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
	
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int num = sc.nextInt();
		
		for(int i = 0; i<=num; i++) {
			sum += i;
		}
		int dice = rd.nextInt(10)+1;
		int result = sum*dice;
		
		System.out.println(sum);
		System.out.println(dice);
		System.out.println(result);
	}

}