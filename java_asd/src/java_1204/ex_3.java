package java_1204;

public class ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str_1 = "ABC123";
		String str_2 = "DEF456";
		int idx = 0;

		for (int i = 0; i < str_1.length(); i++) {
			char c = str_1.charAt(i);
			System.out.println("CharAT:" + c);
			int num = c;

			System.out.println("숫자변환:" + num);

			if (num > 48 && num < 57) {
				idx = i;
				System.out.println(idx);
				break;
			}
		}
		String sub = str_1.substring(idx, str_1.length());
		System.out.println(sub);
	}

}
