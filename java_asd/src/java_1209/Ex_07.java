package java_1209;

public class Ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int cc[]= {100,200,300,400,500};
//		int len;
//		len = cc.length * Integer.BYTES;
//		
//		System.out.println("배열 cc[]가 차지하는 메모리 공간은"+len+"입니다.");
	
	
		int [][]aa = new int [3][4];
		
		int i = 0;
		
		int val = 1;
		
		while (i <3) {
			int k = 0;
			
			while(k<4) {
				
				aa[i][k] = val;
				val++;
				k++;
		
			}
				i++;
				System.out.println(val);
			}
	
	}


}
