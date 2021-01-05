package Chapter5;

public class Sonata {

final static	String model = "Sonata";
final static	String brand = "Hyundai";
static	String owner = "";
static	int maxspeed = 250;
static	int km = 0;

	
	public Sonata(int maxspeed, int km, String name) {
		this.maxspeed = 270;
		this.km = 10;
		this.owner = name;
//		run(model,brand,maxspeed,km,owner);
		
	}
	
	public static void run () {
		System.out.println("나는 :"+model+"입니다.");
		System.out.println("나의 브랜드는 :"+brand+"입니다.");
		System.out.println("나의 주인은 : "+owner+"입니다.");
		System.out.println("나의 최고 속도는 :"+maxspeed+"입니다.");
		System.out.println("나의 누적 km는 :"+km+"입니다.");
	}
	
}
//String model,String brand,int maxspeed,int km,String owner