package source13.chapter13;

import java.util.Stack;

// Stack을 이용한 동전 케이스형의 StackExample 실행 클래스 소스 코딩
public class StackExample {
	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<Coin>();
		
		// LIFO(후입선출) 자료 구조 형식의 coinBox에 동전을 끼워줌
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// coinBox가 isEmpty() 비어있지 않다면(!)
		while (!coinBox.isEmpty()) {  
		//  동전케이스(coinBox)에서 제일 위의 동전을 pop()메서드 활용 꺼내 줍니다.
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}


