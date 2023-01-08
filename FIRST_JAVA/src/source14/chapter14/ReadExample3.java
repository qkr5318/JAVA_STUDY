package source14.chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

// 배열의 지정한 길이 만큼 읽어서 화면으로 보여주는 자바 프로그램을 제작해 봅니다.
public class ReadExample3 {
	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:/Test/test3.db");
		
		byte[] buffer = new byte[5]; // 길이가 5인 배열형의 자료구조 생성
	// 입력 스트림으로부터 3byte를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장 처리함
		int readByteNum = is.read(buffer, 2, 3);
		if(readByteNum != -1) { // 읽을 수 있는 바이트 자료가 있다면(-1이 아니라면)
			// 읽은 바이트 수만큼 반복하면서 배열의 지정한 길이에 저장된 바이트를 출력 처리함
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close(); // 입력 스트림을 닫아줌		
	}
}

