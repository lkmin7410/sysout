package Chapter5;

public class bugerking {
	
static	int bug1 = 5000;
static 	int bug2 = 4000;

	
	public static int pay(int money,int i) {
		int sum = 0;
		if (i==1) {
			sum += money - bug1; 
			System.out.println("bug1 : "+bug1);
		}else if (i==2) {
			sum += money - bug2; 
			System.out.println("bug1 : "+bug2);
		}
		return sum;
	}
}
