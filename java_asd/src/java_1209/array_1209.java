package java_1209;
import java.util.Scanner;

public class array_1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		String str = sc.nextLine();
		

		String array[] = str.split("-| |@|!"); //입력한 문자가 스플릿 돼서 이미 array에 index 값으로 들어가있음
		
		System.out.println(array[2]);
		for (int i = 0; i < array.length; i++) {  //입력한 문자를 문자의 길이만큼 for문을 돌리고, 그것을 다 출력함.
			
	System.out.println(array[i]);
		
		
		}
		System.out.println(array[0]+array[2]);
	}
	

}
