package Chapter6;

public class Men {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book();

		for (int i = b.page_read; i <= b.page; b.page_read++) {
			for (int j = 0; j < b.note.length(); j++) {
				System.out.println(b.note.substring(j, j + 1));
			}
			System.out.println(b.page_read + " 페이지");

			if (b.page_read == b.page) {
				System.out.println("책을 다 읽었습니다.");
				break;
			}
		}

	}

}
