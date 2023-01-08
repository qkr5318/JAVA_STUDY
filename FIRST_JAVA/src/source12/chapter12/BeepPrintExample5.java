package source12.chapter12;

import java.awt.Toolkit;

public class BeepPrintExample5 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());

		// Thread 익명 자식 객체를 이용해서 작업 스레드를 만들 수 있는 또 다른 방법 활용
		Thread taskThread = new Thread() {
			@Override
			public void run() {
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
		};
		System.out.println("프로그램 시작 스레드 이름 : " + taskThread.getName());
		taskThread.start();
		
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



