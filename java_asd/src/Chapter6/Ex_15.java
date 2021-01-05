package Chapter6;



public class Ex_15 {
	
	    public static void printPay(double basePay, int hours) {
	    	
	    	double sum = basePay*hours;
	    	
	    	
	    	if (hours>60) {
	    		System.out.println("error");
	    		System.out.println("====================");

	    	}else if (hours>40) {
		    	double over= hours-40;
		    	double over1 = over*basePay*1.5;
//		    	sum+=over1;
		    	System.out.println("주급 : "+sum+"$");
		    	System.out.println("야근 수당 : "+over1+"$");
		    	System.out.println("====================");
	    	}else {
	    		System.out.println("주급 : "+sum+"$");
	    		System.out.println("====================");
	    	}
	    }

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   	printPay(7.50, 35);
	        printPay(8.20, 47);
	        printPay(10.00, 73);
	        
	}

}
