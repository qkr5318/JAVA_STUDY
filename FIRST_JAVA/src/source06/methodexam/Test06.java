package source06.methodexam;

/* 메서드 오버로딩
 * 메소드 시그너처(Method Signature)는 메서드 이름과 매개변수의 개수,
 * 데이터 타입, 순서를 의미하며, 메서드 이름은 같지만 메서드 시그니처가
 * 다른 메서드를 정의하는 것을 메서드 오버로딩(Overloading)이라고 합니다. */
public class Test06 {
	public static void main(String[] args) {
		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.0, d2 = 3.0;
		System.out.printf("min(%d, %d) = %d \n", i1, i2, min(i1, i2));
		System.out.printf("min(%.1f, %.1f) = %.1f \n", d1, d2, min(d1, d2));
		System.out.printf("min(%d, %d, %d) = %d \n", i1, i2, i3, min(i1, i2, i3));		
	}

	public static int min(int i1, int i2, int i3) {
		return min(min(i1, i2), i3);
	}

	public static double min(double d1, double d2) {
		double result = (d1 < d2) ? d1 : d2; // 조건 연산자 처리
		return result;
	}

	public static int min(int i1, int i2) {
		int result = (i1 < i2) ? i1 : i2; // 조건 연산자 처리
		return result;
	}
}
