package source05.chapter05;

import java.util.Calendar;

public class Test13_EnumWeekExample {
	public static void main(String[] args) {

		Week today = null; // 열거 타입 변수 today 선언 및 null 값 초기화
		System.out.println(today);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		// 일요일(1) ~ 토요일(7)까지의 숫자를 리턴해 줌
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week); // 3 : 화요일
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;			
			break;
		case 2:
			today = Week.MONDAY;			
			break;
		case 3:
			today = Week.TUESDAY;			
			break;
		case 4:
			today = Week.WEDNESDAY;			
			break;
		case 5:
			today = Week.THURSDAY;			
			break;
		case 6:
			today = Week.FRIDAY;			
			break;
		case 7:
			today = Week.SATURDAY;			
			break;
		}
		System.out.println("오늘 요일 = " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다!");
		} else {
			System.out.println("즐거운 하루를 보냅니다!");
		}		
	}
}
