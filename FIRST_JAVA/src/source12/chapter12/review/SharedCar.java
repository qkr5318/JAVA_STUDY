package source12.chapter12.review;

/* 스레드 동기화 : synchronized 동기화 블록 지정(동시 접근자 끼어들기 제한)
1. 다중  스레드  프로그래밍  환경에서 임계영역(critical section)이 있다면 동기화 문제가 발생함.
2. Java는 임계영역을 동기화하려고 synchronized키워드를 제공함.
3. 즉, 한 쓰레드가 진행 중인 작업을 다른 쓰레드가 간섭하지 못하도록 막는 것임.
4. 스레드가 synchronized로 지정된 동기화 블록에 진입하면 락을 걸고, 그 블록을 벗어날 때 락을 풀어줌.
5. 동기화 블록에 진입한 스레드가 코드를 실행할 동안 다른 스레드는 동기화 블록 앞에서 락이 풀릴 때까지 대기해야 함 */

public class SharedCar {

	public synchronized void drive(String name, String where) {
		System.out.println(name + "님이 자동차에 탔습니다!");
		for (int i = 0; i < 3; i++) {
			System.out.println(name + "님이 자동차를 운전합니다!");
		}
		System.out.println(name + "님이 " + where + "에 도착했습니다!");
	}
}


