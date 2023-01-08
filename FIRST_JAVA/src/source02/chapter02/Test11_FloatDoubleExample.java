package source02.chapter02;

public class Test11_FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값 저장
		float var1 = 3.14f;  // float Type은 f 또는 F를 실수 뒤에 붙여줍니다!
		System.out.println("var1 = " + var1);
		double var2 = 3.14;
		System.out.println("var2 = " + var2);
		
		// 정밀도 테스트
		float var3 = 0.1234567890123456789f;
		System.out.println("var3 = " + var3); // var3 = 0.12345679
		double var4 = 0.1234567890123456789;
		System.out.println("var4 = " + var4); // var4 = 0.12345678901234568
		
		// 지수 e 사용하기
		double var5 = 3e6; // 3 X (10의 6승)
		System.out.println("var5 = " + var5); // var5 = 3000000.0
		float var6 = 3e6F; // 3 X (10의 6승)
		System.out.println("var6 = " + var6); // var6 = 3000000.0
		double var7 = 2e-3;  // 2 X (10의 -3승)
		System.out.println("var7 = " + var7); // var7 = 0.002
	}
}
