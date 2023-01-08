package source12.chapter12.review;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 스레드를 2초간 일시 정지시킴
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}

