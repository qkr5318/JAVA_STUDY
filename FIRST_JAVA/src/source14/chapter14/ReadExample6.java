package source14.chapter14;

import java.io.FileReader;
import java.io.Reader;

// 지정한 길이 만큼 데이터 읽기
public class ReadExample6 {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("C:/Test/test9.txt");
		
		char[] buffer = new char[5];
		
		// 입력 스트림으로부터 3개의 문자를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장 처리함
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close(); // 입력 스트림을 닫아줌
	}
}


