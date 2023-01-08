package source12.chapter12;

public class StopFlagExample {
	public static void main(String[] args) {

		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		printThread.setStop(true); // 스레드를 종료하기 위해 stop 필드를 true로 변경 처리함
	}

}


