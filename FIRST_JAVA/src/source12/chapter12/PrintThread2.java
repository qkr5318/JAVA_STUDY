package source12.chapter12;


// 앞서 일시 정지 코드인 Thread.sleep(1)을 사용하지 않고,
// Thread.interrupted()를 사용해서
// PrintThread의 interrupt()가 호출되었는지 확인한 다음
// while문을 빠져나가도록 PrintThread2 클래스를 수정해 봅니다.
public class PrintThread2 extends Thread {

	@Override
	public void run() {

//      다음 13행 ~ 22행까지는 Page547 무한 반복해서 출력하는 스레드 소스 내용임
//		try {
//		while (true) {
//			System.out.println("지금은 실행 중입니다!");
//				Thread.sleep(1);
//			}
//		}
//		catch (InterruptedException e) {
//				System.out.println("스레드를 종료합니다!");
//			}
		
//		다음은 Page548 무한 반복해서 출력하는 스레드 소스 내용임
		while (true) {
			System.out.println("지금은 실행 중입니다!");
			if (Thread.interrupted()) {
				break;  // while문을 빠져나옴
			}
		}
			System.out.println("자원을 정리 합니다!");
			System.out.println("실행을 종료 합니다!");
	}
}



