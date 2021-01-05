package Capter7;

import java.util.Scanner;

public class Exam_main {

	public static void main(String[] args) {
		Exam exam = new Exam();
		input(exam);
		print(exam);
	}

	public static void print(Exam exam) {

		int kor = exam.getKor();
		int eng = exam.getEng();
		int Math = exam.getMath();
		int sic = exam.getSic();
		int sos = exam.getSos();

		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = kor + eng + Math + sic + sos;
		double avg = total / 5.0;

		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", Math);
		System.out.printf("과학 : %d\n", sic);
		System.out.printf("사회 : %d\n", sos);

		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {

		String list[] = { "국어", "영어", "수학", "과학", "사회" };

		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < list.length; i++) {
			if (i == 0) {
				exam.setKor(do_process(list[i]));
			} else if (i == 1) {
				exam.setEng(do_process(list[i]));
			} else if (i == 2) {
				exam.setMath(do_process(list[i]));
			} else if (i == 3) {
				exam.setSic(do_process(list[i]));
			} else if (i == 4) {
				exam.setSos(do_process(list[i]));
			}
		}
	}

	public static int do_process(String str) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.printf(str + " : ");
			num = scan.nextInt();
			if (num < 0 || 100 < num)
				System.out.println(str + " 성적은 0~100까지의 범위만 입력해주세요.");
		} while (num < 0 || 100 < num);

		System.out.println("----------------------------------------------------------");
		return num;
	}
}