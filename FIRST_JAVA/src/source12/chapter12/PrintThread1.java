package source12.chapter12;

// 무한 반복해서 출력하는 스레드 제작
public class PrintThread1 extends Thread{

	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			System.out.println("지금은 실행 중입니다!");
		}
		System.out.println("자원을 정리합니다!");
		System.out.println("실행을 종료합니다!");		
	}
}

