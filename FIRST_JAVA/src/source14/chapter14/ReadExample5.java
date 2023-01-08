package source14.chapter14;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample5 {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("C:/Test/test8.txt");

		char[] buffer = new char[100]; // 길이 100인 배열 생성
		
		while (true) {
			int readCharNum = reader.read(buffer); // 배열 길이만큼 읽어들이기
			// 파일 끝에 도달했을 경우, 즉, readCharNum 변수에 더이상 읽을 데이터가 없을 경우(-1인 경우)
			if (readCharNum == -1) { 
				break;
			}
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close(); // 입력 스트림을 닫아줌
	}
}


