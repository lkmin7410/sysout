package Capter7;

import java.util.Scanner;

public class User {

private	String ID;
private	String Name;
private	int Pass;
	
	
	boolean run = true;
	Scanner sc = new Scanner(System.in);

	void id_check(String id) {
		if (id.length() > 6) {
			System.out.println("잘못 입력 하셨습니다.");
			id();
		}
	}

	void na_check(String na) {
		if (na.length() > 4) {
			System.out.println("잘못 입력 하셨습니다.");
			na();
		}
	}

	void pa_check(int pa) {
		if (pa > 99999999) {
			System.out.println("잘못 입력 하셨습니다.");
			pa();
		}
	}

	void id() {
		System.out.print("ID : ");
		ID = sc.next();
		id_check(ID);
	}

	void na() {
		System.out.print("Name : ");
		Name = sc.next();
		na_check(Name);
	}

	void pa() {
		System.out.print("Pw : ");
		Pass = sc.nextInt();
		pa_check(Pass);
	}

}
