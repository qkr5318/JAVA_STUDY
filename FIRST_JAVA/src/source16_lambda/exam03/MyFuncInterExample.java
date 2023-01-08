package source16_lambda.exam03;

import javax.sound.midi.SysexMessage;

public class MyFuncInterExample {

	public static void main(String[] args) {

		MyFuncInterface mfi;
		
		// 매개변수 2개를 갖고 있는 method() 메서드 활용
		mfi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(mfi.method(2, 5));
		
		mfi = (x, y) -> {
			return x + y;
		};
		System.out.println(mfi.method(2, 5));
		
		mfi = (x, y) -> x + y;
		System.out.println(mfi.method(2, 5));
		
		mfi = (x, y) -> sum(x, y);
		System.out.println(mfi.method(2, 5));
		
	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}



