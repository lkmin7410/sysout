package Chapter5;

public class ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

}

//연습문제 4-2
//int sum = 0;
//for (int i = 1; i<=20; i++) {
//	if(i%2==0) {
//		continue;
//	}if(i%3==0) {
//		continue;
//	}
//	
//	sum += i;
//}System.out.println(sum);
//

//연습문제 4-3   풀지못함;
//
//int sum = 0;
//int total = 0;
//
//for(int num = 1;num <= 10;num++){
//    sum += num;
//    total += sum;
//	
//    System.out.println(total);
//
//}

//연습문제 4-4 역시 혼자 풀지못함
//
//int sum = 0;
//int num = 1;
//while(true) {
//	if(num%2==0) {
//		sum-=num;
//	}else {
//		sum+=num;
//	}System.out.println(sum+"번째");
//	if(sum>=100) {
//		break;
//	}
//}
//
//연습문제 4-5
//int i = 0;
//while (i <= 10) {
//	int j = 0;
//	while (j <= i) {
//		System.out.print("*");
//		j++;
//	}
//	System.out.println();
//	i++;
//}

//연습문제 4-6
//int dice_1[] = {1,2,3,4,5,6};
//int dice_2[] = {1,2,3,4,5,6};
//
//for (int i = 0 ; i <dice_1.length;i++) {
//	for(int j = 0; j <dice_2.length; j++) {
//		if (i+j==6) {
//			System.out.print(i);
//			System.out.println(j);
//		}
//	}
//}
//
//연습문제 4-7  
//int a = (int)(Math.random()*6+1);
//System.out.println(a);
//