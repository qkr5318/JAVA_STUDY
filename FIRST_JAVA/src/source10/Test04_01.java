package source10;


// 예외 처리 : 오류 메시지 직접(강제) 적용하기

public class Test04_01 {
	public static void main(String[] args) {

		int a = 100, b = 0;
		int result;
		try {
			if (b == 0) {
				throw new Exception("0으로 나누시려고 하십니까? 안됩니다!"); 
			}
			result = a/b;
			System.out.println(result);	
		} catch (Exception e) {
			System.out.println("발생 오류 ==> " + e.getMessage());
		}
	}
}


