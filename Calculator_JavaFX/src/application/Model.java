package application;

// 구체적인 연산을 처리하는 단위 모듈인 Model 코딩
public class Model {
	
	public int calculate(String operator, int x, int y) {
		// operator 연산자, operand 피연산자 항을 의미함
		if (operator.equals("+")) {
			return x+y;
			
		}else if(operator.equals("-")){
			return x-y;
		}else if(operator.equals("X")){
			return x*y;
		} else {
			return x/y;
		}
	}
}
