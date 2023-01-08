package source12.chapter12.review;

// 메인 스레드가 실행하는 소스 코드
public class MainThreadExample {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}

}

