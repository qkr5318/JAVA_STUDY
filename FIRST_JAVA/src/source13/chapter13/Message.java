package source13.chapter13;

// 다음은 Queue를 이용해서 간단한 메시지 큐를 구현하는 예시입니다.
// 먼저 넣은 메시지가 반대쪽으로 먼저 나오기 때문에 넣은 순서대로 메시지가 처리됩니다.
// 우선 Message 클래스를 소스 코딩합니다!
public class Message {

	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}



