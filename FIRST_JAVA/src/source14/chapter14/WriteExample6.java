package source14.chapter14;

import java.io.FileWriter;
import java.io.Writer;

// 이번에는 'A', 'B', 'C', 'D', 'E', 'F'가 저장된 배열에서
// 'B', 'C', 'D' 내용만 선택적으로 C드라이브 Test 폴더 안에 있는
// test9.txt 파일에 출력(기록) 저장 처리 합니다.
// 즉, 배열의 일부 내용들을 선택적으로 파일에 기록(출력) 처리합니다.
public class WriteExample6 {
	public static void main(String[] args) throws Exception {

		// 데이터 도착지를 C드라이브에 Test 폴더 안에 test9.txt 파일에 문자 기반 파일 출력 스트림 자료를 생성함
		Writer writer = new FileWriter("C:/Test/test9.txt");
		
		char [] array = {'A', 'B', 'C', 'D', 'E'};
		
		// 배열의 1번 인덱스부터 3개의 배열 요소 데이터를 선택적으로 파일에 출력(기록) 처리함
		writer.write(array, 1, 3); 
		
		System.out.println("test9.txt 파일에 출력이 잘 되었습니다!");
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자 데이터를 출력 처리함
		writer.close(); // 출력 스트림을 닫아줌
	}
}



