package java_1204;

public class ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1234";
		int str_1 = str.length();
		char c = 'E';
		int sum_1 = 0;

		for (int i = 0; i < str_1; i++) {
			String sub = str.substring(i, i + 1);

			int num = Integer.parseInt(sub);

			System.out.println(num + "x" + c + "=" + num * c);

			int sum = num * c;

			sum_1 += sum;

		}
		System.out.println("총 합은 : " + sum_1);

//		System.out.println("몇 단?");
//		int dan = sc.nextInt();

//		for (int i = 2; i<=9; i++) {
//			for (int j=1;j<=9;j++) {
//			
//			System.out.println(i+"x"+j+"="+i*j);
//		}
//	}
	}
}
