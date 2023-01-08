package source13.collection_review;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// 다음은 키보드로 아이디와 비밀번호를 입력 받아서, Hashtable에 저장되어 있는 Key(아이디)와 Value(비밀번호)를
// 비굑한 후에 로그인 여부를 출력하는 예시 입니다.
// 아이디와 비밀번호를 체크해 주는 자바 프로그램 소스 코딩하기!
public class HashtableExample {
	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();
		
		// Map 컬렉션 자료구조에 아이디와 비밀번호를 미리 저장해 놓음
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("winter", "1234");
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 입력해 주시기 바랍니다!");
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 : ");
			String password = scan.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println(id + "님~ 로그인이 되었습니다!");
					break;
				} else {
					System.out.println(id + "님의 비밀번호가 일치하지 않습니다!");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다!");
			}
		}
	}
}


