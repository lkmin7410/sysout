package test;

public class Coding_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "9B768C";
		String array[] = new String [str.length()];
		char a[] = new char[array.length];
		int sum = 0;
		
		for(int i = 0; i<str.length(); i++) {
			array[i] = str.substring(i,i+1);
		}

		for(int i = 0; i<array.length;i++) {
			a[i] = str.charAt(i);
			sum += a[i];
		}System.out.println(sum);
	}

}
