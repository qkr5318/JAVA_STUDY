package source14.chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

// 다음은 10, 20, 30, 40, 50이 저장된 배열에서 20, 30, 40을 선택적으로
// 파일 C:\Test\test3.db로 출력해서 처리하는 자바 프로그램을 제작해 봅니다.
// 배열 일부를 출력 처리하는 WriteExample3 클래스 소스 코딩!
public class WriteExample3 {
	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("C:/Test/test3.db");
		
		byte[] array = {10, 20, 30, 40, 50};
		
		// 배열의 1번 인덱스부터 3개 데이터까지만 선택적으로 출력 처리함
		os.write(array, 1, 3); 
		System.out.println("파일 출력이 정상적으로 이루어졌습니다!");
		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트형 자료를 출력 처리함
		os.close(); // 출력 스트림을 닫아줌
	}
}



