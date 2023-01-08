package source11.chapter11.java_api_class;

import java.util.Calendar;
import java.util.Date;

public class Test06_Calendar {
	public static void main(String[] args) {

		Date now = new Date();
		System.out.println(now);
		// Calendar 클래스는 추상클래스이기 때문에 직접 객체(인스턴스)를 생성할 수 없고,
		// 인스턴스를 생성하려면 Calendar 클래스 메서드를 통해서, 완전히 구현된 클래스의
		// 인스턴스를 얻어야 합니다. 이때 사용하는 메서드가 getInstance() 메서드 입니다.
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR) + "년");
		// Calendar 클래스에서는 월(MONTH)을 나타낼 때 1월부터 12월을 0부터 11까지로 표현하기 때문에 +1을 해주었음
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println(cal.get(Calendar.HOUR) + "시"); // 12시간제 형식의 시간 표현
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시"); // 24시간제 형식의 시간 표현
		System.out.println(cal.get(Calendar.MINUTE) + "분"); // 현재 시간 분단위 표현		
	}
}




