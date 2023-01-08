package source12.chapter12;

// 다음 예제는 PrintThread2를 실행한 후 1초 후에 PrintThread2를 멈추도록 interrupt() 메서드를 호출합니다.
public class InterruptExample {
	public static void main(String[] args) {

		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt(); // 스레드를 종료하기 위해 이번에는 InterruptedException을 발생 시켜줌.
	}

}
