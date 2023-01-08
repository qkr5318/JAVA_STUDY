package source12.chapter12;

public class BeepPrintExample4 {
	public static void main(String[] args) {

		// Task 스레드 실행
		Thread taskThread = new BeepThread();
		taskThread.start();
		
		// 메인 스레드 실행
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
