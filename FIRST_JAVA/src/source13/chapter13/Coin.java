package source13.chapter13;

// 다음은 동전 케이스를 Stack 클래스로 구현한 예시입니다.
// 먼저 넣은 동전은 제일 밑에 깔리고, 나중에 넣은 동전이 위에 쌓이기 때문에
// 동전 케이스형의 Stack 클래스에서 동전을 빼면 마지막에 넣은 동전이 먼저 나오게 됩니다.
public class Coin {

	private int value;

	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}



