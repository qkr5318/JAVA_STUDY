package source12.chapter12.review;

import java.awt.Toolkit;

// 3초 주기로 10번 비프음 발생하는 자바 프로그램 소스 코딩하기!
public class SleepExample {
	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				System.out.println("띵!");
				Thread.sleep(3000);  // 3초 동안 메인 스레드를 일시 정지 상태로 만들어줌
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
