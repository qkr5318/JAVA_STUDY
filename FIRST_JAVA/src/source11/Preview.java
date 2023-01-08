package source11;

public class Preview {
	public static void main(String[] args) {

		String str = "장나라";
		
		System.out.println(str);
		
		// 기본적으로 Object 클래스의 toStrint() 메서드는
		// "클래스이름@16진수해시코드"로 구성된 문자 정보를 리턴해 줍니다.
		// 예시 : java.lang.Object@15db9742
		Object obj = new Object();
		System.out.println(obj.toString());  // java.lang.Object@15db9742

	}

}
