package source11.chapter11;

// 주민등록번호에서 남성과 여성을 구분하는 자바 프로그램을 제작해 봅니다.
// 이때, 주민등록번호에서 7번째 인덱스 문자를 통해서 여성과 남성을 구분할 수 있습니다.
public class StringCharAtExample {
	public static void main(String[] args) {
                    //01234567
		String ssn = "828252-2322133";
		char gender = ssn.charAt(7);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("성별은 남성입니다!");
			break;
		case '2':
		case '4':
			System.out.println("성별은 여성입니다!");
			break;
		}
	}
}


