package source12.chapter12;

public class DaemonExample {

	public static void main(String[] args) {
		System.out.println("main() 함수가 실행됩니다!");
	
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // AutoSaveThread를 데몬 스레드로 만들어 줌
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드를 종료 합니다!");
	}
}


