package source10;

public class Test05 {
	
	static void handlingException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("호출된 메서드에서 예외가 처리됨!");
		}
	}
	
	public static void main(String[] args) {

		System.out.println("★ main() 함수가 제일 먼저 실행됨을 확인합니다!");
		handlingException();
	}
}


