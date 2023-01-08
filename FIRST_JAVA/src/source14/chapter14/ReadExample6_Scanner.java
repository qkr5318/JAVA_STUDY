package source14.chapter14;

import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

// 지정한 길이 만큼 데이터 읽기
public class ReadExample6_Scanner {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("읽고 싶은 txt 파일명만 입력해 주세요 ==> ");
		String str = scan.nextLine();
		Reader reader = new FileReader("C:/Test/" + str + ".txt");
		
		char[] buffer = new char[5];
		
		// 입력 스트림으로부터 3개의 문자를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장 처리함
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close(); // 입력 스트림을 닫아줌
	}
}


