package source14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 파일을 복사하는 자바 프로그램을 제작해 봅니다.
// 예시) C드라이브 Test 폴더 안에 있는 nice.txt 파일을 복사해서 copy.txt 파일로 만들어 줍니다.
public class Test07_FileCopy {
	public static void main(String[] args) throws IOException {

		FileInputStream fin = null;
		FileOutputStream fos = null;
		
		try {
			fin = new FileInputStream("C:/Test/nice.txt");
			byte b [] = new byte[100]; // 저장 공간을 만들어 줌(초기화)
			while (true) {
				// read() 메서드는 파일에서 읽어온 데이터를 b에 저장 처리하고
				// 읽어온 바이트수 크기를 리턴 처리해 줍니다. n에는 읽어온 바이트수 크기가 저장되고
				// 파일 끝이면 -1이 저장 됩니다.			
				int n = fin.read(b);
				if(n==-1) { // 파일의 데이터를 모두 읽어서 끝에 도달하면(더이상 읽은 데이터가 없을 경우 : -1)
					break;
				}
				fos = new FileOutputStream("C:/Test/copy.txt");
				fos.write(b); // 파일로 b 배열 요소 내용 출력(기록)
				fos.close(); // 스트림 닫기
				System.out.println("파일 복사 성공!");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
