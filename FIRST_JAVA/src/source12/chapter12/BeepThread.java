package source12.chapter12;

import java.awt.Toolkit;

public class BeepThread extends Thread {

	@Override
	public void run() {
		// 작업 스레드 실행 내용 정의
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



