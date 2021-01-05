package Chapter5;




public class Me {
	
static	int maxspeed = 270;
static	int km = 10;
static	String owner = "이경민";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int maxspeed = 270;
//		int km = 10;
//		String owner = "이경민";
		Sonata mycar = new Sonata(maxspeed, km, owner);
		
		mycar.run();
		
		
		
	}

}
