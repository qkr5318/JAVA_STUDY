package source05;

// 배열의 선언과 생성, 크기 계산
public class Test02 {
	public static void main(String[] args) {

//		String data [] = {"하나", "둘", "셋", "넷", "다섯"};
//		String data [] = new String[] {"하나", "둘", "셋", "넷", "다섯"};
//		String data [];
//		data = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		String data[] = new String[5];
		data[0] = "장나라";
		data[1] = "김희선";
		data[2] = "이영애";
		data[3] = "전지현";
		data[4] = "김다미";
		int count;
		count = data.length;
		System.out.printf("배열 str[]의 요소 개수는 %d개 입니다!\n", count);		
	}
}
