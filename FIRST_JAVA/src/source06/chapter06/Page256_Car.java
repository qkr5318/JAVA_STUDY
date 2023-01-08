package source06.chapter06;

public class Page256_Car {

	// 필드
	int gas;

	
	// 디폴트(기본) 생성자
	
	// 메소드 : setGas() 메서드는 리턴값이 없는 메서드로
	// 매개값을 받아서 gas 필드값을 변경 처리함
	public void setGas(int gas) {
		this.gas = gas;
	}
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다!");
			// gas가 0일때는 "gas가 없습니다!" 메시지 표시하고, false 리턴 처리함
			return false;  
		}
		System.out.println("gas가 있습니다!");
		// gas가 0이 아닐경우, "gas가 있습니다!" 메시지 표시하고, true 리턴 처리함
		return true;
	}
	
	// run() 메서드는 리턴값이 없는 메서드로 gas 필드값이 0이면
	// return문으로 메서드를 강제 종료 처리함.
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다! (gas 잔량 = " + gas + ")");
				gas -= 1;  // gas = gas -1;
			} else {
				System.out.println("멈춥니다! (gas 잔량 = " + gas + ")");
				return; //  여기서 return문은 run() 메서드 종료 처리 역할을 함.
			}
		}
	}
	
}
