package source14.chapter14;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {

		// 바이트 기반 출력 스트림 FileOutputStream을 생성하고, 보조 스트림인 PrintStream은 연결 처리해 줌
		FileOutputStream fos = new FileOutputStream("C:/Test/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		// 라인 단위로 문자열을 출력 처리함
		ps.println("[프린터 보조 스트림 활용 예시]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력 처리합니다!");
		
		System.out.println("C드라이브에 Test 폴더 안에 printstream.txt 파일 생성 및 데이터 출력(기록)이 되었습니다!");
		ps.flush(); // 버퍼에 남아 있는 잔류 문자열들을 모두 내보내줌.
		ps.close(); // 출력 스트림을 닫아줌
	}
}


