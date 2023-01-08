package source12.chapter12.review;

// 다음 예시는 1초 주기로 save() 메서드를 자동 호출하도록 AutoSaveThread를 작성하고,
// 메인 스레드가 3초 후 종료되면 AutoSaveThread도 같이 종료되도록
// AutoSaveThread를 데몬 스레드로 활용하는 자바 프로그램을 제작해 봅니다.
// 1초 주기로 save() 메서드를 호출하는 데몬 스레드 AutoSaveThread 클래스 소스 코딩!
public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("작업 내용을 자동 저장 처리합니다!");
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


