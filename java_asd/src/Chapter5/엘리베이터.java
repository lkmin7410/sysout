package Chapter5;

public class 엘리베이터 {

	static int floor = 0;
	
	public 엘리베이터(int floor) {
		
		this.floor = floor;
		System.out.println("현재 층수는"+floor+"입니다.");
	}
	public static void up(int up) {
		floor = up; 
		System.out.println(floor+"층에 도착했습니다.");
	}
	public static void down() {
		
	}
}
