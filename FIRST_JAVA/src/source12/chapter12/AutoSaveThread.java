package source12.chapter12;

// 1초 주기로 save() 메서드를 호출하는 데몬 스레드 생성
public class AutoSaveThread extends Thread {

	public AutoSaveThread() {
		System.out.println("AutoSaveThread()가 생성자 되었습니다!");
	}
	
	public void save() {
		System.out.println("작업 내용을 저장 처리합니다!");
	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		} 
	}
}

