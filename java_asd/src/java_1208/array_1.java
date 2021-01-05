package java_1208;
import java.util.Scanner;
public class array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int i[] = {10,20,30,40,50,60};
		int j = 5;
		int sum = 0;
		int leng = i.length;
		for (int k = 0; k<i.length;k++) {
			sum = i[k]+j;
			System.out.println("배열 합계:"+ sum);
			
		}
		
	}

}
