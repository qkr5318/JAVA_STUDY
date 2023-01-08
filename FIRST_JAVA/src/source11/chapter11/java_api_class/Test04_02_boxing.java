package source11.chapter11.java_api_class;

// 자동 Boxing이 일어나는 경우, 래퍼 객체를 써야할 자리에
// Primitive type(기본 형)값을 썼을 때 일어나는 래퍼 객체로의 자동 변환 처리할 때임

public class Test04_02_boxing {
	public static void main(String[] args) {

		double num = 123.45; // Primitive type의 변수 num 선언 및 123.45로 초기화 처리
		printDouble(new Double(num));
		
		printDouble(34.22);
		
	}

	 static void printDouble(Double obj) {
		System.out.println(obj); // 객체화 Double 타입의 obj : 123.45 출력됨
	}
}

