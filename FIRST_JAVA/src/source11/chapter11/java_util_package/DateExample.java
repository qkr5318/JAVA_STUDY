package source11.chapter11.java_util_package;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now); // Mon Dec 12 09:59:20 KST 2022
		String strNow= now.toString();
		System.out.println(strNow); // Mon Dec 12 09:59:20 KST 2022
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf);
		String sdfNow = sdf.format(now);
		System.out.println(sdfNow);		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf2);
		String sdf2Now = sdf2.format(now);
		System.out.println(sdf2Now);
	}
}


