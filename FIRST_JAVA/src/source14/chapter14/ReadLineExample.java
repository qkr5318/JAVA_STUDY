package source14.chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

// 라인 단위로 문자열 읽기를 처리하는 ReadLineExample 클래스 소스 코딩!
public class ReadLineExample {
	public static void main(String[] args) throws Exception {

		// 기본 스트림인 문자 기반 입력 스트림 Reader 클래스를 활용해서 데이터 읽어오기
//		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
		
//		Reader reader = new FileReader("C:/Test/language.txt");
		Reader reader = new FileReader("C:\\Test\\language.txt");
		
		// 보조 스트림인 BufferedReader 클래스를 연결 처리해 줌.
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			String data = br.readLine(); // 라인 단위 문자열을 읽고, 읽은 데이터를 리턴 처리해서 data 변수에 대입해 줌. 
			if (data == null) {  // data 변수에 null 값일 경우
				break;  // break문으로 while문을 빠져나감
			}
			System.out.println(data);
		}
		br.close(); // 입력 스트림 닫기
	}
}


