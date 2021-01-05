package Chapter6;

public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String i1 = "돈가스";
		int pr1 = 7500;
		
		String i2 = "햄버거";
		int pr2 = 5500;
		
		String i3 = "랍스타";
		int pr3 = 87500;

		
		int don_num = 4;
		int ham_num = 2;
		int rob_num = 6;
		
		int sum = (pr1*don_num)+ (pr2*ham_num)+(pr3*rob_num);
		
		
		
		System.out.println(i1+"*"+don_num);
		System.out.println(i2+"*"+ham_num);
		System.out.println(i3+"*"+rob_num);
		System.out.println("====================");
		
		System.out.println(sum);
		
		
	}

}
