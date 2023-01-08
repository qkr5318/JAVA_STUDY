package source12.chapter12;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		// 작업 스레드 실행 내용
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {  // i = 0, 1, 2, 3, 4
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}



