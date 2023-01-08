package source10;

// throws 키워드를 사용하여 호출된 메서드에서 발생한 예외를
// 호출한 메서드로 떠넘기는 예제입니다!

public class Test06 {
									// throws 예외를 미루어 처리함
	static void handlingException() throws Exception {		
			throw new Exception();
	}
	
	public static void main(String[] args) {

		System.out.println("★ main() 함수가 제일 먼저 실행됨을 확인합니다!");
		
		try {
			handlingException();
		} catch (Exception e) {
			System.out.println("main() 메서드에서 예외가 처리됨!");
		}
	}
}


