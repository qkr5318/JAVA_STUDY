package source14.chapter14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// 다음은 반복해서 키보드로부터 입력된 문자열을 라인 단위로 읽고 모니터에 출력합니다.
// 반복을 멈추려면 'q' 또는 "quit"를 입력하면 됩니다.
// 키보드로부터 라인 단위 문자열을 얻는 GetLineStringFromKeyboard 클래스 소스 코딩!
public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {

		// InputStream을 Reader 변환 처리하고, 다시 BufferedReader 연결 처리함
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
	    while (true) {
			System.out.print("문자열을 입력해 주세요 ==> ");
			String lineStr = br.readLine();  // 라인 단위로 문자열을 읽어옴
			// 만약에 q 또는 quit를 읽게 되면 while 반복문을 break(빠져나감) 처리함.
			if(lineStr.equals("q") || lineStr.equals("quit")) {
				System.out.println("프로그램이 종료 되었습니다!");
				break;
			}
			System.out.println("입력된 문자열 내용 = " + lineStr);
			System.out.println("=======================================");
		}
		br.close(); // 입력 스트림을 닫아줌		
	}
}



