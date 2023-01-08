package source11.chapter11.java_api_class;

// 자동 Unboxing이 일어나는 경우
// Primitive type 값을 써야할 자리에 래퍼 객체를 썼을 때 일어나는
// Primitive type 값으로 자동 변환 처리됨.
public class Test04_01_Unboxing {
	public static void main(String[] args) {
		int num = 10;
		Integer obj = new Integer(num); // boxing
		System.out.println(obj);
		
		int sum = obj + 20; // unboxing
		
		System.out.println(sum); // Primitive type(기본형)의 sum 값 = 30;
	}
}

