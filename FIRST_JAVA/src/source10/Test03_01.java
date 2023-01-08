package source10;

public class Test03_01 {

	static void method() {
		try {
			int num1 = 10;
			int num2 = 0;
			int result = num1/num2;
			System.out.println("@ method() 호출!");
			return; // void형의 메서드 종료 처리!			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("◎ [중요 체크] method()의 finally 블럭이 실행됨!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("★ main() 메서드 실행 확인!");		
		Test03_01.method();
	}

}
