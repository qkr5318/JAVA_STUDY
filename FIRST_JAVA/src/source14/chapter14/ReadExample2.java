package source14.chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

// 다음은 앞서 WriteExample2 클래스에서 C:/Test/test2.db 파일로 출력 저장 처리한 내용을
// 길이가 100인 배열을 생성하고 read(byte[] b) 메서드로 한꺼번에 100byte를 읽고 배열에 저장합니다.
// 즉, 파일에 읽을 바이트가 100개 이상 남아 있을 경우에만 100byte를 한꺼번에 읽게 합니다.
// 그렇지 않을 경우, 읽을 수 잇는 바이트 수 만큼만 읽게 합니다.
// 배열 길이 만큼 읽어서 화면으로 보여주는 자바 프로그램을 제작해 봅니다.
public class ReadExample2 {
	public static void main(String[] args) throws Exception {

		byte[] buffer = new byte[100]; // 길이가 100인 배열형의 자료구조 생성
		InputStream is = new FileInputStream("C:/Test/test2.db");
		while (true) {
			int readByteNum = is.read(buffer); // 배열 길이 만큼 읽어들임
			// readByteNum가 -1과 같다면(readByteNum 없다면 또는 파일 끝에 도달했을 경우)
			if (readByteNum == -1) {  
				break;				
			}
			// 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력 처리함
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close(); // 입력 스트림을 닫아줌		
	}
}

