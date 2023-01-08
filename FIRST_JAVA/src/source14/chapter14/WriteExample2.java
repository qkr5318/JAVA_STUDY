package source14.chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

// 다음은 10, 20, 30이 저장된 배열을 파일 C:\Test\test2.db로 출력하는
// 자바 프로그램을 제작해 봅니다.
// 이번에는 배열 전체를 출력 처리하는 write(byte[] b) 메서드를 활용해 봅니다.
public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("C:/Test/test2.db");
		
		byte [] array = {10, 20, 30};
		
		os.write(array);  // 배열에 저장된 모든 바이트 자료를 출력(기록) 처리함

		System.out.println("바이트 형식의 파일 출력 처리가 잘 되었습니다.");
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트까지 출력 처리함
		os.close(); // 출력 스트림을 닫아줌		
	}
}


