package source14.chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

// 다음은 10, 20, 30이 저장된 각각의 바이트 자료를 파일 C:\Test\test1.db로 출력해서
// test1.db의 내용으로 저장 처리하는 자바 프로그램 제작 예시 입니다.
// 1byte씩 출력하는 WriteExample 클래스 소스 코딩!
public class WriteExample {
	public static void main(String[] args) throws Exception {

		// 데이터 도착지를 test1.db로 하는 바이트 기반 파일 출력 스트림을 생성 처리함
		OutputStream os = new FileOutputStream("C:/Test/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte씩 C:/Test/test1.db 파일에 write() 메서드로 출력 기록 처리함
		os.write(a);
		os.write(b);
		os.write(c);
		
		System.out.println("기록이 잘 되었습니다!");
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트까지 출력 처리함
		os.close(); // 출력 스트림을 닫음
	}
}


