package java_1204;
import java.util.Scanner;
public class string_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요");
		String str = sc.next(); //문자를 입력한다.
		
		int leng = str.length(); //leng 은 내가 입력한 글자의 수
		
		for (int i=0;i<leng;i++) { 
			String sub = str.substring(i,i+1);// i=0 i+1= 0+1 (루프로 돌때마다 1+2 2+3식으로 진행 ex abcd의 a는 (0,1) b는 (1,2)이다.
			if(sub.equals("!")||sub.equals("#")) {   //확인하는곳, 만약에 한 글자씩 확인을 했는데 특수문자가 있는지
			 if(sub.equals("!")) {
					System.out.println("특수문자 !는 입력할 수 없습니다.");
					
					
				}
			}else {
				//System.out.println(sub);
			}
			
		
		
			
		}
		
		
		
		
		
		
		
		
//		String num_str = "AB345";
//		String num_str1 = "12BCD";
//		String num_char = "ABC";
//		char num = ' ';
//
//		String sub1=num_str.substring(2,5); //자름
//		String sub2=num_str1.substring(0, 2);
//
//		int a = Integer.parseInt(sub1); //변환
//		int b = Integer.parseInt(sub2);
//		
//
//
//		for (int i = 0; i < num_char.length(); i++) {
//			num = num_char.charAt(i);
//					}
//		System.out.println(a + b+num);
			
			
//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
			
			
//		String num_str = "12345";
//		
//		System.out.println("String 형:"+ num_str);
//		
//		int str_num = Integer.parseInt(num_str); //integer.parseInt 는 문자를 숫자로 형 변환 시켜줌
//		int str_num_1 = Integer.valueOf(num_str); 
//		
//		System.out.println("int 형_pars:"+str_num); //이게 더 좋음
//		System.out.println("int 형_valu:"+str_num_1);
//		
//		
//		String sum = num_str + 10;
//		int sum_1 = str_num + 10;
//		
//		System.out.println(sum);
//		System.out.println(sum_1);
//		

	}
}
