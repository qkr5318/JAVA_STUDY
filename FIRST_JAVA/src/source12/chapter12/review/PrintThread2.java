package source12.chapter12.review;

// 무한 반복해서 출력하는 스레드
public class PrintThread2 extends Thread {

	@Override
	public void run() {
//		try {
//		while (true) {
//			System.out.println("지금은 쓰레드가 실행 중입니다!");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {
//				System.out.println("고객님~ 현재 서비스 점검중입니다!");
//		}
		
		while (true) {
			System.out.println("지금은 쓰레드가 실행 중입니다!");
			if (Thread.interrupted()) {
				break; // while문을 빠져나오게 break문을 활용해서 처리해 줌
			}
		}
		
		System.out.println("쓰레드의 자원을 정리 합니다!");
		System.out.println("쓰레드의 실행을 종료 합니다!");
	}
}


