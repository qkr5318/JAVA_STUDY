package source16_lambda;

public class Preview {

	// 함수형 프로그래밍
	interface MyAdd{
		public abstract int plus(int a, int b); // 추상 메서드 생성
	}
	
	public static void main(String[] args) {

		MyAdd cal = (int a, int b) -> (a + b);
		
		System.out.println(cal.plus(10, 20) + "입니다!");
		
		
//		int x = 10, y = 20;
//		
//		int sum = add(x, y);
//		System.out.println(x + " + " + y + " = " + sum + "입니다!");
//	}
//
//	public static int add(int n1, int n2) {
//		int result = n1 + n2;
//		return result;
//	}

	}
}



