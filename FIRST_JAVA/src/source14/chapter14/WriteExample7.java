package source14.chapter14;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample7 {
	public static void main(String[] args) throws Exception {

		// 데이터 도착지를 C드라이브에 Test 폴더 안에 test11.txt 파일에 문자 기반 파일 출력 스트림 자료를 생성함
		Writer writer = new FileWriter("C:/Test/test11.txt");
		
		
		String str = "Jangnara";
		
		// 문자열 데이터 전체를 파일에 출력(기록) 처리함
//		writer.write(str);  // C:/Test/test10.txt
		
		// 문자열 데이터 중에서 선택적으로 파일에 출력(기록) 처리함
		writer.write(str, 3, 2);  // C:/Test/test11.txt
		
//		System.out.println("test10.txt 파일에 출력이 잘 되었습니다!");
		System.out.println("test11.txt 파일에 출력이 잘 되었습니다!");
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자 데이터를 출력 처리함
		writer.close(); // 출력 스트림을 닫아줌
	}
}




