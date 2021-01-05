package Chapter5;

import java.sql.Date;

public class Smart_phone {
	String maker = "Samsung";
	String model = "갤럭시 s20 ultra";
	String camera = "1억화소";

	public static void turnOn(String on) {
		if (on.equals("on")) {
			Date d = time();
			System.out.println("현재시간은" + d + "입니다.");
		} else {
			System.out.println("");
		}
	}

	public static String drag(String on) {
		String news = chrome();
		return news;
	}

	public static Date time() {
		Date date_now = new Date(System.currentTimeMillis());
		return date_now;
	}

	public static String chrome() {
		String news = "코로나19 3단계 격상";
		return news;
	}
}
