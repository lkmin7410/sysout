package test;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Coding_8_time {
	
	void time() {
		SimpleDateFormat format2 = new SimpleDateFormat ( "yyyy년 MM월dd일 HH시mm분ss초");
		Date time = new Date();
		String time2 = format2.format(time);
		System.out.println(time2);
	}


}
