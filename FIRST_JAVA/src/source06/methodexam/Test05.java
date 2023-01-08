package source06.methodexam;

// 값 전달(call by value) 처리
public class Test05 {

	public static void main(String[] args) {

		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x는 " + x);
		
		increment(x);
		
	}

	public static void increment(int x) {
		System.out.println("increment() 메서드를 시작할 때의 x는 " + x);
		x++;
		System.out.println("increment() 메서드가 끝날 때의 x는 " + x);
	}
}
