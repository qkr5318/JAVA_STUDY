package source14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader 클래스를 사용해서 파일을 읽어오는 자바 프로그램을 제작해 봅니다.
public class Test10_BufferedReader {
	public static void main(String[] args) throws IOException {

		int i = 0;
		String file;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("읽어올 파일의 경로와 이름을 입력해 주시기 바랍니다 ==> ");
		file = read.readLine();
		System.out.println(file + " : 문서 내용은 아래와 같습니다!");
		
		// FileReader 클래스를 활용해서 파일을 읽어들입니다!
		FileReader fr = new FileReader(file);
		
		// BufferedReader 클래스를 사용해서 버퍼링 처리를 합니다!
		BufferedReader br = new BufferedReader(fr);
		
		// -1(데이터가 없을때)이 아닐때까지 데이터를 읽어옵니다
		while ((i=br.read()) != -1) {
			System.out.print((char)i);
		}
		br.close(); // 스트림을 닫아줍니다!
	}
}

// 실행 결과
// 읽어올 파일의 경로와 이름을 입력해 주시기 바랍니다 ==> c:/Test/first.txt
// c:/Test/first.txt : 문서 내용은 아래와 같습니다!
// 파일 생성시간
// Fri Dec 16 14:12:27 KST 2022
// Have a good Time~ ^-^/


