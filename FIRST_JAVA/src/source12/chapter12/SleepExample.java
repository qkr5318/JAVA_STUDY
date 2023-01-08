package source12.chapter12;

import java.awt.Toolkit;

// 3초 주기로 비프(beep)음을 10번 발생 시키는 자바 프로그램을 제작해 봅니다.
public class SleepExample {
	public static void main(String[] args) {

		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 for (int i = 0; i < 10; i++) { // i = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 (10번 인덱싱)
			 toolkit.beep();
			 try {
				Thread.sleep(3000); // 3초 동안 메인 스레드를 일시 정지 상태로 만들어 줌				
			} catch (InterruptedException e) {	} 
		}
	}
}

