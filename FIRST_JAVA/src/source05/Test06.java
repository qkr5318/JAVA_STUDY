package source05;

import java.util.ArrayList;

public class Test06 {

	public static void main(String[] args) {

		ArrayList<String> value = new ArrayList<String>();
		System.out.println("초기 배열 크기 = " + value.size());
		
		value.add("A");
		value.add("B");
		value.add("C");
		value.add("D");
		value.add(1, "장나라");
		
		System.out.println("ArrayList 클래스의 add() 메서드 사용 후 배열 크기 = " + value.size());
		
		System.out.println(value);
		
		System.out.println("value.get(1) 실행 후 값 = " + value.get(1));
		
		value.remove(2);
		System.out.println("value.remove(2) 실행 후 값 = " + value);
		System.out.println("배열 크기 = " + value.size());
		
		if(value.get(1) == "장나라") {
			System.out.println("데이터 있음!");
		} else {
			System.out.println("데이터 없음!");
		}
	}
}
