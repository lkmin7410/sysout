package Chapter5;

public class 메소드 {

	public static void one(int a) {

		int sum = a + 10;
		two(sum);

	}

	public static void two(int a) {

		int sum = a + 10;
		three(sum);

	}

	public static int three(int a) {
		int sum = a + 10;
		four(sum);
		return sum;
	}

	public static int four(int a) {
		int sum = a + 10;

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int hap = 0;

		hap = four(i);

		System.out.println(hap);

	}

}
