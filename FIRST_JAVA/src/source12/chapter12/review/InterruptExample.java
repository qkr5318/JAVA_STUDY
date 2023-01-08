package source12.chapter12.review;

// 다음 예시는 PrintThread2를 실행한 후에 1초 후에  PrintThread2를 멈추도록 interrupt() 메서드를 호출합니다.
// 1초 후에 출력 스레드를 중지 처리하는 InterruptExample 클래스 소스 코딩!
public class InterruptExample {
	public static void main(String[] args) {

		Thread taskThread = new PrintThread2();
		taskThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// taskThread를 종료하기 위해, 이번에는 InterruptedException을 발생시켜줍니다.
		taskThread.interrupt();  
	}
}


