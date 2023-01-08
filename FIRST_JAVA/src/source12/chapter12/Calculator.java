package source12.chapter12;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// Calculator 계산기 메모리에 값을 설정(저장)하는 setMemory() 메서드 정의
	public void setMemory(int memory) {
		this.memory = memory;  // int형의 memory 매개값을 memory 필드에 저장 처리함
		//  스레드를 2초간 일시 정지시킴
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { }
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}


