package Chapter6;

public class Ev {

	static int floor;
static	int max_w;

	int floor_no(int w1,int w2, int cho) {
		this.max_w = w1+w2;
		
		if (this.max_w > 100) {
			System.out.println("최대중량 초과입니다.");
		} else {
			this.floor = cho;
			System.out.println(this.floor + "층에 도착했습니다.");
		}
		return this.floor;
	}
}
