package source14.chapter14;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample4 {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("C:/Test/test7.txt");
		while (true) {
			int data = reader.read(); // 한 문자씩 읽어들이기
			// 파일 끝에 도달했을 경우, 즉, data 변수에 더이상 읽을 데이터가 없을 경우(-1인 경우)
			if (data == -1) { 
				break;
			}
			System.out.println((char)data);
		}
		reader.close(); // 입력 스트림을 닫아줌
	}
}


