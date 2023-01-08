package source12.chapter12.review;

// 무한 반복해서 출력하는 스레드 소스 코딩
public class PrintThread1 extends Thread {

	// boolean 타입의 default 값은 false입니다!
	// 즉, stop 필드의 default 값은 false입니다!
	private boolean stop;  

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("지금은 쓰레드가 실행 중입니다!");
		}
		System.out.println("쓰레드가 종료되어 자원을 정리 합니다!");
		System.out.println("쓰레드의 실행을 종료 합니다!");
	}
}


