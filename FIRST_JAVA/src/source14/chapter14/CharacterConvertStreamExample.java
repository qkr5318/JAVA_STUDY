package source14.chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

// 문자 변환 보조 스트림 활용 예시
public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {

		write("문자 변환 스트림을 사용합니다!");
		String data = read();
		System.out.println(data);
	}

	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Test/test1.txt");
		// 주 스트림인 FileInputStream에 보조 스트림인 InputStreamReader를 연결 처리했음
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		// 보조 스트림인 InputStreamReader을 이용해서 문자를 입력 처리함
		int readCharNum = reader.read(buffer);
		reader.close();
		// char 배열에서 읽은 수만큼 문자열로 변환 처리함
		String data = new String(buffer, 0, readCharNum); 
		return data;
	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Test/test1.txt");
		// 주 스트림인 FileOutputStream에 보조 스트림인 OutputStreamWriter를 연결 처리했음
		Writer writer = new OutputStreamWriter(fos);
		// OutputStreamWriter 보조 스트림을 이용해서 str 변수에 있는 문자를 출력 처리함
		writer.write(str);
		writer.flush(); // 버퍼에 남아 있는 데이터를 모두 출력 처리함
		writer.close(); // 스트림을 닫아줌
	}
	
	

}




