package source12.chapter12.review;

// 메인 스레드가 실행하는 코드 작성
public class DaemonExample {
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("메인() 메서드 프로그램 시작 쓰레드 이름 : " + mainThread.getName());
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		System.out.println("작업 스레드 이름 : " + autoSaveThread.getName());
		autoSaveThread.setDaemon(true); // AutoSaveThread를 데몬 스레드로  설정 처리함
		autoSaveThread.start();
		
		// 아래 로직은 메인 스레드 처리 내용입니다!
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드를 종료 합니다!");
	}
}




