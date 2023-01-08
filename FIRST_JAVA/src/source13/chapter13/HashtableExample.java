package source13.chapter13;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// 다음은 키보드로 아이디와 비밀번호를 입력받아서, Hashtable에 저장되어 있는 키(아이디)와 값(비밀번호)을
// 비교한 후 로그인 여부를 출력하는 예시 입니다.
// 아이디와 비밀번호를 검사하는 HashtableExample 클래스 작성!
public class HashtableExample {
	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();
		
		// String 타입의 아이디(Key)와 String 타입의 비밀번호(Value) 4쌍을 미리 저장 처리함
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		// 키보드로부터 입력된 내용을 받기 위해 scan 객체 참조 변수 생성함
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요!");
			System.out.print("아이디 : ");
			String id = scan.nextLine(); // 키보드로 입력한 아이디를 scan해서 읽어들임.
			System.out.print("비밀번호 : ");
			String password = scan.nextLine(); // 키보드로 입력한 비밀번호를 scan해서 읽어들임.
			System.out.println("======================================================");
			
			// 만약에, map 컬렉션에 있는 데이터 자료(map)와 키보드로 입력한 아이디(id)가 같다면
			if (map.containsKey(id)) {   
			// map 컬렉션의 get() 메서드로 id 키값의 Value 값을 키보드로 입력한
			// password값과 equals() 메서드를 활용하여 비교 처리했을때 같다면
				if (map.get(id).equals(password)) {
					System.out.println("로그인 되셨습니다!");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다!");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다!");
			}
		}
	}
}


