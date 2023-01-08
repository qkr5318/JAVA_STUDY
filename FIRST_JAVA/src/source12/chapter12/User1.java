package source12.chapter12;

public class User1 extends Thread {

	private Calculator calculator;

	public void setCalculator(Calculator calculator) {		
		this.setName("User1"); // Thread-0 이름을 User1으로 설정 처리함
		this.calculator = calculator; // 공유 객체인 Calculator를 필드에 저장 처리함
	}

	@Override
	public void run() {
		calculator.setMemory(100); // 공유 객체인 Calculator의 메모리에 100을 저장 처리함
	}
}

