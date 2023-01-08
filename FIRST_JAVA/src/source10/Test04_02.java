package source10;

/* 강제로(고의로) 예외 발생 시키기
- 키워드 throw를 사용해서 프로그래머가 고의로 예외를 발생시킬 수 있다.
- 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다. :
  Exception e = new Exception("고의로 에러 발생");
- 키워드 throw를 이용해서 예외를 발생시킨다. : throw e;
*/

public class Test04_02 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생 시킨 예외 처리");
//			throw e; // 예외 강제 발생 처리	
			throw new Exception("이것은! 내가 만든 예외 처리닷!!!");
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}		
	}	
}


