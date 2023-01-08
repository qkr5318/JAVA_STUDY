package source16_lambda.exam02;

public class MyMethodRefExample {
	public static void main(String[] args) {

		
		MyFuncInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println("(" + x + "*5)의 결과값 = " + result);
		};
		fi.method(7); // method() 메서드에 인수값으로 7을 대입해 준다는 의미임.
		
		fi = (x) -> {
			System.out.println("(" + x + "*5)의 결과값 = " + (x*5));
		};
		fi.method(3); // method() 메서드에 인수값으로 3을 대입해 준다는 의미임.
		
		fi = x -> System.out.println("(" + x + "*5)의 결과값 = " + (x*5));
		fi.method(2); // method() 메서드에 인수값으로 3을 대입해 준다는 의미임.
	}
}

