package source13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test13_SortSearch {
	public static void main(String[] args) {

		String [] s = {"ACE", "DJANGO", "BOY", "END"};
		List<String> list = Arrays.asList(s);
		// Arrays.asList는 배열 요소를 새로운 리스트 객체로 만들어주어
		// 추가, 삭제가 가능하게 해줌.
		
		// list 변수에 [ACE, BOY, DJANGO, END] 정렬 처리됨.
		Collections.sort(list);
		System.out.println(list);
		
		int k = Collections.binarySearch(list, "BOY");
		System.out.println(k);
		System.out.println("BOY 검색 문자는 " + (k+1) + "번째에 있습니다!");
		System.out.println("=============================================");
		
		int n = Collections.binarySearch(list, "END");
		System.out.println(n);
		System.out.println("END 검색 문자는 " + (n+1) + "번째에 있습니다!");
		System.out.println("=============================================");
		
		// list 변수에 [END, DJANGO, BOY, ACE] 역정렬이 처리됨.
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("=============================================");
		
		// list 변수에 [ACE, BOY, DJANGO, END] 정렬 처리됨
		Collections.sort(list);
		System.out.println(list);
	}
}



