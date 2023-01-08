package source14.chapter14;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample7_Scanner {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("scan 파일에 기록하고 싶은 문자열을 입력해 보시기 바랍니다 ==> ");
		String str = scan.nextLine();

		// 데이터 도착지를 C드라이브에 Test 폴더 안에 scan.txt 파일에 문자 기반 파일 출력 스트림 자료를 생성함
		Writer writer = new FileWriter("C:/Test/scan.txt");
		
		// 문자열 데이터 전체를 파일에 출력(기록) 처리함
		writer.write(str);  // C:/Test/scan.txt		
		
		System.out.println("scan.txt 파일에 기록이 잘 되었습니다!");
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자 데이터를 출력 처리함
		writer.close(); // 출력 스트림을 닫아줌
	}
}




