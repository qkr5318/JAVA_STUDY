package source12.chapter12;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());

		// 작업 스레드 생성
		Runnable beepTask = new BeepTask();
		Thread taskThread = new Thread(beepTask);
		System.out.println("프로그램 시작 스레드 이름 : " + taskThread.getName());
		taskThread.start();
		
		// 메인 스레드  처리
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


