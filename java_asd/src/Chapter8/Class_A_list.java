package Chapter8;

import java.util.Scanner;

public class Class_A_list {

	Class_B[] Class_B_array;
	int current;

	public Class_A_list() {
		this.Class_B_array = new Class_B[3];
		this.current = 0;
	}

	public void plus() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// 객체 생성 뒤, 값 입력
		Class_B B1 = new Class_B();
		System.out.println(this.current + 1 + "번째 배열의 첫번째 값 입력");
		B1.num_1 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		B1.str = sc.next();
		System.out.println(this.current + 1 + "번째 배열의 두번째 값 입력");
		B1.num_2 = sc.nextInt();

		switch (B1.str) {
		case "+":
			B1.num_3 = B1.num_1 + B1.num_2;
			break;
		case "-":
			B1.num_3 = B1.num_1 - B1.num_2;
			break;
		case "*":
			B1.num_3 = B1.num_1 * B1.num_2;
			break;
		case "/":
			B1.num_4 = B1.num_1 / B1.num_2;
			break;

		}

		// 매개변수 배열 객체에 값 담기
		this.Class_B_array[this.current] = B1;
		this.current++;

	}

	public void print() {
		for (int i = 0; i < this.current; i++) {
			// B1 객체 다시 생성 뒤 값 담기.
			Class_B B1 = this.Class_B_array[i];
			if (B1.str.equals("/")) {
				System.out.println(B1.num_4);
			} else {

				System.out.println(B1.num_3);
			}
		}
	}

}