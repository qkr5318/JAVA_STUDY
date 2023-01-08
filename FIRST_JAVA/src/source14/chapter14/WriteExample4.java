package source14.chapter14;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
	public static void main(String[] args) throws Exception {

		// 데이터 도착지를 C드라이브에 Test 폴더 안에 test7.txt 파일에 문자 기반 파일 출력 스트림 자료를 생성함
		Writer writer = new FileWriter("C:/Test/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		// 한문자씩 출력(파일에 기록) 처리함
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		System.out.println("test7.txt 파일에 출력이 잘 되었습니다!");
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자 데이터를 출력 처리함
		writer.close(); // 출력 스트림을 닫아줌
	}
}



