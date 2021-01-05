package java_1210;
import java.util.Scanner;
public class ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력");
		String str = sc.nextLine();
		int leng = str.length();
		
		
		
		
		int cnt = 0;
		
		for (int i = 0; i<leng; i++) {
			
			for (int j= 0 ; j<number.length; j++) {
				if(!(str_array[i].equals(number[j]))) {
					cnt++;
					
				}
			}if(cnt<=9) {
				cnt = 0;
				
			}else if (cnt==10) {
				System.out.println("숫자 입력 안함");
				break;
			}
		}
		
		

	}

}
