package source12.chapter12.review;


class Thread_Ex1 extends Thread{

	public Thread_Ex1() {
		setName("ThreadJang"); // Thread_Ex1() 생성자의 작업 스레드 이름 설정
	}
	
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

public class Test01_01_Thread {
	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("메인() 메서드 프로그램 시작 쓰레드 이름 : " + mainThread.getName());
		

		Thread_Ex1 taskThread = new Thread_Ex1();
		System.out.println("작업 스레드 이름 : " + taskThread.getName());
		taskThread.start();
	}
}







