package source12.chapter12.review;

// 다음 예시는 PrintThread1을 실행한 후 1초 후에 PrintThread1을 stop 플래그 활용 형식으로
// 쓰레드를 멈추게 하는 자바 프로그램을 제작해 봅니다.
public class StopFlagExample {
	public static void main(String[] args) {

		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 작업스레드(객체 참조 변수명 : printThread)를 종료하기 위해
		// stop 필드를 true로 변경 처리함
		printThread.setStop(true);  
	}
}



