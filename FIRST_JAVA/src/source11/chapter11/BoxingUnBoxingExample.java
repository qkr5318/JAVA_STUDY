package source11.chapter11;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {

		// Boxing(박싱) : 기본 타입을 클래스 타입으로 변경 처리함
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// UnBoxing(언박싱) : 클래스 타입 데이터를 기본 타입으로 변경 처리함
		int value1 = obj1.intValue();
		System.out.println(value1);
		int value2 = obj2.intValue();
		System.out.println(value2);
		int value3 = obj3.intValue();
		System.out.println(value3);
	}
}


