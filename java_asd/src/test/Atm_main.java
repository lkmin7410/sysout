package Code_test;

public class Atm_main {

	static int money = 50000;
static	boolean run = true;
	public static void main(String[] args) {

		menu menu = new menu();
		while (run) {
			menu.menu();
		}
	}
}
