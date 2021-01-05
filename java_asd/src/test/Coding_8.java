package test;

public class Coding_8 {

	public static void main(String[] args) {

		Coding_8_sc sc = new Coding_8_sc();
		Coding_8_list list = new Coding_8_list();
		Coding_8_call call = new Coding_8_call();
		Coding_8_time time = new Coding_8_time();
		Coding_8_search search = new Coding_8_search();

		while (true) {
			System.out.println("1.전화번호 부 || 2.전화 걸기 || 3.시간 확인 || 4. 인터넷 검색");
			int cho = sc.sc();

			switch (cho) {
			case 1:
				list.list();
				break;

			case 2:
				call.call();
				break;

			case 3:
				time.time();
				break;

			case 4:
				search.search();
				break;

			}

		}

	}

}
