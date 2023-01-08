package source12.chapter12;

public class ThreadB extends Thread {

	public ThreadB() {
		setName("ThreadJ"); // ThreadJ 이름 설정
	}
	
	@Override
	public void run() {
		// ThreadB 실행 내용
		for (int i = 0; i < 2; i++) {  // i = 0, 1
			System.out.println(getName() + "가 출력한 내용!");
		}
		
		
	}
}


