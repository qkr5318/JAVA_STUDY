package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
	// 처음 저장 변수 operator의 값을 ""로 초기화함 
	
	private String operator = "";
	
	// 기존의 숫자를 의미하는 변수 x의값을 0으로 초기화함
	private int x = 0;
	
	// Model 클래스형의 값을 저장한 model 객체 변수 인스턴스를 생성함
	private Model model = new Model();
	
	
	@FXML
	private Text result;
	
	@FXML
	private void operand(ActionEvent event) {
		result.setText(result.getText() + ((Button)event.getSource()).getText());
	}
	
	//모든 이벤트 객체에 공통적으로 있고 가장 많이 사용되는 메소드 getSource() : 어떤 컴포넌트에 이벤트가 발생하였는지 이벤트 소스를 알려줌.
	//getSource()는 Object를 리턴하므로 캐스팅 연산자가 필요하다
	//parseInt("10"); // 10 -> 문자열 "10"을 숫자로 변환하여 정수 10을 리턴합니다.
//	연산자 (Operator) 정의
//
//	프로그램에서 데이터를 처리하여 결과를 산출하는 것을 연산(operation)이라 한다.
//	연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.
//	연산되는 데이터는 피연산자(operand)라고 한다.
//	예) 산술연산 +, -, *, /, %
	@FXML
	private void operator(ActionEvent event) {
		if (((Button)event.getSource()).getText().equals("=")) {
			result.setText(model.calculate(operator, x, Integer.parseInt(result.getText())) + "");
		} else {
			// 기존 연산자를 operator 변수에 대입 처리함
			operator = ((Button) event.getSource()).getText();
			// 새로 입력된 값을 x 변수에 대입 처리함
			x = Integer.parseInt(result.getText());
			// 현재 결과창을 비워줌
			result.setText("");
		}
	}
}
