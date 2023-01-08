package source14.chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

// 다음은 앞서 WriteExample 클래스에서 C:/Test/test1.db 파일로 출력 저장 처리한 내용을
// 1byte씩 끝까지 읽어서 화면으로 보여주는 자바 프로그램을 제작해 봅니다.
public class ReadExample {
	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("C:/Test/test1.db");
		while (true) {
			int data = is.read(); // 1byte씩 읽어들임
			// data가 -1과 같다면(data 없다면 또는 파일 끝에 도달했을 경우)
			if (data == -1) {  
				break;				
			}
			System.out.println(data);
		}
		is.close(); // 입력 스트림을 닫아줌		
	}
}

