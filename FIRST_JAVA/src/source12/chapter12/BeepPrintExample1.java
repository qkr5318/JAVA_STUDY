package source12.chapter12;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());		

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
		for (int i = 0; i < 5; i++) { // i = 0, 1, 2, 3, 4 (인덱스 5번 실행)
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500);  // 0.5초간 일시 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
			
			for (int i = 0; i < 5; i++) {  // i = 0, 1, 2, 3, 4 (인덱스 5번 실행)
				System.out.println("띵");
				try {
					Thread.sleep(500);  // 0.5초간 일시 정지
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
		}
	}
}
