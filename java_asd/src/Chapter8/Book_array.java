package Chapter8;

import java.util.Scanner;

public class Book_array {

	Book[] Book_array;
	int current;
	
	public Book_array() {
		this.Book_array = new Book[3];
		this.current = 0;
	}

	public void add() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// 객체 생성 뒤, 값 입력
		Book b = new Book();
		System.out.print("이름 :");
		String name = sc.next();
		b.setName(name);
		System.out.print("번호 : ");
		String number = sc.next();
		b.setNumber(number);

		// 매개변수 배열 객체에 값 담기
		this.Book_array[this.current] = b;
		this.current++;

	}

	public void print() {
		for (int i = 0; i < this.current; i++) {
			// B1 객체 다시 생성 뒤 값 담기.
			Book b = this.Book_array[i];
			
			System.out.println(b.getName());
			System.out.println(b.getNumber());
		}
	}
}
