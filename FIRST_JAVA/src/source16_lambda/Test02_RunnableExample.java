package source16_lambda;

// Runnable 인터페이스 활용 람다식 구현
public class Test02_RunnableExample {
	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
