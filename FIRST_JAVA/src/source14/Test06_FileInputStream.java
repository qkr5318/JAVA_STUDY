package source14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class Test06_FileInputStream {
	public static void main(String[] args) {

		FileInputStream fin = null;
		OutputStream oos = System.out;
		
		try {
			fin = new FileInputStream("C:/Test/nice.txt");  // 파일로 부터 데이터를 입력 받는다는 의미임
			while (true) {
				int n = fin.read();  // 입력 받은 파일에 있는 데이터를 읽기 위한 구분자 선언
				if(n == -1) {  // 만약, n == -1(더이상 읽은 내용이 없을 경우)
					break;
				}
				oos.write((char)n); // 입력 데이터를 화면으로 표시해 줌.
				oos.flush();  // 버퍼에 남아 있는 데이터를 모두 화면으로 출력해 줌.
			}
			oos.close();
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다!");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}


