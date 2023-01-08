package source14;

import java.io.IOException;
import java.io.OutputStream;

public class Test03_OutputStream {
	public static void main(String[] args) throws IOException {

		OutputStream out = System.out;
		byte b[] = {65, 66, 67, 68};
		out.write(b);
		System.out.println("\n=========================");
		
		// b 배열의 1번 인덱스로부터 2개 배열 요소 출력하기
		out.write(b, 1, 2);
		System.out.println("\n=========================");
		
		int n = 100;
		out.write(n); // 아스키코드값 100 : d가 출력 처리됨
		out.flush(); // 데이터를 버퍼에서 내보내면서 화면으로 출력함
		out.close(); // 스트림을 닫아줌
	}
}


