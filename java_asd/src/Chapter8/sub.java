package Chapter8;

public class sub {

	int sum[] = new int[4];
	
	void sub(String str){
		String array[] = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
		array[i] = str.substring(i,i+1);
		}
		for(int i = 0; i <array.length; i++) {
			sum[i] = Integer.parseInt(array[i]);
		}
	}
}
