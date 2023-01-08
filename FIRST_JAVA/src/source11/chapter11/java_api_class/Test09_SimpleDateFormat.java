package source11.chapter11.java_api_class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test09_SimpleDateFormat {
	public static void main(String[] args) {

		// 패턴기호(설명)
		// y(연), M(월), w(월 구분 없는 주), W(주), d(일), D(월 구분 없는 일),
		// E(요일), a(오전과 오후), h(시간 : 1 ~ 12), H(시간 : 0~23), k(시간: 1~24),
		// K(시간 : 0 ~ 11), m(분), s(초), S(밀리초), z(타임존)
		
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf2.parse("2023-02-28");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sdf2.format(date));
	}
}



