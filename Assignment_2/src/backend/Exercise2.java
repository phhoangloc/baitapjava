package backend;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {
	
	public void question1() {
		int x=5;
		System.out.printf("%d%n",x);
	}
	public void question2() {
		int x=100000000;
		System.out.printf(Locale.US,"%,d%n",x);
	}
	public void question3() {
		float x= (float) 225.567098;
		System.out.printf("%6.4f%n",x);
	}
	public void question4() {
		// TODO Auto-generated method stub
		String name = "nguyễn văn A";
		System.out.printf("%s%n2",name + " hiện đang động thân");
	}
	public void question5() {
		// TODO Auto-generated method stub
		Date newDate = new Date();
		String parthen = new String("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat dateFormat = new SimpleDateFormat(parthen);
		String date = dateFormat.format(newDate);
		System.out.println("hôm nay là: " + date);
		System.out.println("bây giờ là: "+ date);
	}
}
