package source14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04_FileOutputStream {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;
		
		try {
			// C드라이브 Test 폴더 안에 text01.txt 파일로 내용을 출력 저장함
			fos = new FileOutputStream("C:/Test/text01.txt");
			byte b []= {76, 79, 86, 69}; // 아스키코드 선언 : LOVE
			fos.write(b); // 파일로 b배열 요소값 출력
			fos.close();
			System.out.println("파일로 저장 성공!");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}


