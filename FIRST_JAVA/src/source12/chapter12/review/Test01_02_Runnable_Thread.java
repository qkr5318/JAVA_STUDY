package source12.chapter12.review;

// Runnable 인터페이스를 implements하는 클래스를 선언함
class Thread_Ex2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "번 : " + i + " * " + i + " = " + (i*i));			
		}	
	}	
}

public class Test01_02_Runnable_Thread {
	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("메인() 메서드 프로그램 시작 쓰레드 이름 : " + mainThread.getName());
		

		Thread_Ex2 taskThread = new Thread_Ex2();
		Thread obj  = new Thread(taskThread, "ThreadJang");
		System.out.println("작업 쓰레드 이름 : " + obj.getName());
		obj.start();		
	}
}









